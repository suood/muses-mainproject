package com.muses.service;

import com.muses.util.UUIDTools;
import com.muses.util.wxpay.WxUtil;
import com.muses.util.wxpay.WxpayConfig;
import com.muses.util.wxpay.XMLUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by xinhuan on 2015/12/2.
 */
@Service
public class WxpayService {

    /**
     * 统一下单请求
     * @param request
     * @return
     */
    public String unifiedOrder(HttpServletRequest request){

        //终端设备号(门店号或收银设备ID)，注意：PC网页或公众号内支付请传"WEB"
        String device_info = request.getParameter("device_info");
        //随机字符串，不长于32位
        String nonce_str = UUIDTools.getUUID();
        //商品或支付单简要描述
        String body = request.getParameter("body");
        //商品名称明细列表
        String detail = request.getParameter("detail");
        //商户系统内部的订单号,32个字符内、可包含字母
        String out_trade_no = request.getParameter("out_trade_no");
        //订单总金额，单位为分
        String total_fee = request.getParameter("total_fee");
        //APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP
        String spbill_create_ip = request.getParameter("spbill_create_ip");
        //交易类型 取值如下：JSAPI--公众号支付，NATIVE:扫码支付，APP
        String trade_type = "NATIVE";

        //组装请求数据
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("appid",WxpayConfig.appid);
        treeMap.put("mch_id", WxpayConfig.mch_id);
        treeMap.put("nonce_str", nonce_str);
        treeMap.put("notify_url",WxpayConfig.notify_url);
        treeMap.put("out_trade_no", out_trade_no);
        treeMap.put("device_info",device_info);
        treeMap.put("body",body);
        treeMap.put("detail",detail);
        treeMap.put("total_fee",total_fee);
        treeMap.put("spbill_create_ip",spbill_create_ip);
        treeMap.put("trade_type", trade_type);

        String xml = WxUtil.getPackage(treeMap);

        // 创建HttpClientBuilder
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        HttpPost httpPost = new HttpPost(WxpayConfig.unifiedorder);

        StringEntity entity;
        //预支付id
        String prepay_id ="";
        //获取扫码支付连接
        String code_url = "";
        try {
            entity = new StringEntity(xml, "utf-8");
            httpPost.setEntity(entity);
            HttpResponse httpResponse;
            // post请求
            httpResponse = closeableHttpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            //Map<String, String> map = null;
            if (httpEntity != null) {
                // 打印响应内容
                String result = EntityUtils.toString(httpEntity, "UTF-8");
                // 过滤
                result = result.replaceAll("<![CDATA[|]]>", "");
                Map<String, String> map = XMLUtil.doXMLParse(result);
                if(map != null){
                    prepay_id  = (String) map.get("prepay_id");
                    code_url  = (String) map.get("code_url");
                }
                //prepay_id = Jsoup.parse(result).select("prepay_id").html();
                //String code_url  = Jsoup.parse(result).select("trade_type").html();
            }
            // 释放资源
            closeableHttpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if("".equals(prepay_id) || "".equals(code_url) ){//请求数据出错
            return "";
        }
        //请求数据无误，可生成预支付订单写入数据库
        return code_url;
    }

    /**
     * 微信回调函数
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     */
    public String wxNotify(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        //获取微信支付POST过来反馈信息
        Map<String,String> params = XMLUtil.parseXml(request);
        //返回状态码
        String return_code = params.get("return_code");
        String return_msg = params.get("return_msg");
        if("SUCCESS".equalsIgnoreCase(return_code)){//
            //设备号
            String device_info = params.get("device_info");
            //随机字符串
            String nonce_str = params.get("nonce_str");
            //签名
            String sign = params.get("sign");
            //业务结果
            String result_code = params.get("result_code");
            //是否关注微信公众号
            String is_subscribe = params.get("is_subscribe");
            //交易类型
            String trade_type = params.get("trade_type");
            //付款银行
            String bank_type = params.get("bank_type");
            //总金额
            String total_fee = params.get("total_fee");
            //货币种类
            String  fee_type = params.get("fee_type");
            //现金支付金额
            String cash_fee = params.get("cash_fee");
            //微信支付交易号
            String transaction_id = params.get("transaction_id");
            //商户订单号
            String out_trade_no = params.get("out_trade_no");
            //支付完成时间
            String time_end = params.get("time_end");

            if("SUCCESS".equals(result_code)){//交易成功,处理订单信息

            }else {
                return_code = "FAIL";
            }
        }else {
            return_code = "FAIL";
        }

        String result = "<xml><return_code><![CDATA["+return_code+"]]></return_code>"
        +"<return_msg><![CDATA["+return_msg+"]]></return_msg></xml>";

        return result;
    }
}
