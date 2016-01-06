package com.muses.service;

import com.muses.util.alipay.*;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by xinhuan on 2015/12/4.
 */
@Service
public class AlipayService {

    /**
     * 手机wap端提交支付表单
     * @param request
     * @return
     */
    public String AlipaySubmitWap(HttpServletRequest request){
        //支付类型
        String payment_type = "1";
        String result = "请求失败";
        try{
            //商户网站订单系统中唯一订单号，必填
            String out_trade_no = request.getParameter("WIDout_trade_no");

            //订单名称
            String subject = request.getParameter("WIDsubject");
            //必填

            //付款金额
            String total_fee = request.getParameter("WIDtotal_fee");
            //必填

            //商品展示地址
            String show_url = request.getParameter("WIDshow_url");
            //必填，需以http://开头的完整路径，例如：http://www.商户网址.com/myorder.html

            //订单描述
            String body = request.getParameter("WIDbody");
            //选填

            //超时时间
            String it_b_pay = request.getParameter("WIDit_b_pay");
            //选填

            //钱包token
            String extern_token = request.getParameter("WIDextern_token");
            //选填

            //把请求参数打包成数组
            Map<String, String> sParaTemp = new HashMap<String, String>();
            sParaTemp.put("service", "alipay.wap.create.direct.pay.by.user");
            sParaTemp.put("partner", AlipayConfig.partner);
            sParaTemp.put("_input_charset", AlipayConfig.input_charset);
            sParaTemp.put("notify_url", AlipayConfig.notify_url);
            sParaTemp.put("return_url", AlipayConfig.return_url);
            sParaTemp.put("out_trade_no", out_trade_no);
            sParaTemp.put("subject", subject);
            sParaTemp.put("total_fee", total_fee);
            sParaTemp.put("seller_id", AlipayConfig.seller_id);
            sParaTemp.put("payment_type", payment_type);
            sParaTemp.put("show_url", show_url);
            sParaTemp.put("body", body);
            sParaTemp.put("it_b_pay", it_b_pay);
            //sParaTemp.put("extern_token", extern_token);

            //待请求参数数组
            Map<String, String> sPara = AlipayUtil.buildRequestPara(sParaTemp,AlipayConfig.sign_type);
            HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler.getInstance();

            HttpRequest req = new HttpRequest(HttpResultType.BYTES);
            //设置编码集
            req.setCharset(AlipayConfig.input_charset);

            req.setParameters(AlipayUtil.generatNameValuePair(sPara));
            req.setUrl(AlipayConfig.alipay_gateway_new+"_input_charset="+AlipayConfig.input_charset);
            HttpResponse response = httpProtocolHandler.execute(req,"","");
            if (response == null) {
                return null;
            }
            response.getByteResult();

            result = new String(response.getByteResult());
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public String AlipaySubmitPc(HttpServletRequest request){
        //支付类型
        String payment_type = "1";
        String result = "请求失败";
        try {
            //商户网站订单系统中唯一订单号，必填
            String out_trade_no = request.getParameter("WIDout_trade_no");

            //订单名称
            String subject = request.getParameter("WIDsubject");
            //必填

            //付款金额
            String total_fee = request.getParameter("WIDtotal_fee");
            //必填

            //商品展示地址
            String show_url = request.getParameter("WIDshow_url");
            //必填，需以http://开头的完整路径，例如：http://www.商户网址.com/myorder.html

            //订单描述
            String body = request.getParameter("WIDbody");


            //把请求参数打包成数组
            Map<String, String> sParaTemp = new HashMap<String, String>();
            sParaTemp.put("service", "create_direct_pay_by_user");
            sParaTemp.put("partner", AlipayConfig.partner);
            sParaTemp.put("_input_charset", AlipayConfig.input_charset);
            sParaTemp.put("notify_url", AlipayConfig.notify_url);
            sParaTemp.put("return_url", AlipayConfig.return_url);
            sParaTemp.put("out_trade_no", out_trade_no);
            sParaTemp.put("subject", subject);
            sParaTemp.put("total_fee", total_fee);
            sParaTemp.put("seller_id", AlipayConfig.seller_id);
            sParaTemp.put("payment_type", payment_type);
            sParaTemp.put("show_url", show_url);
            sParaTemp.put("body", body);

            //待请求参数数组
            Map<String, String> sPara = AlipayUtil.buildRequestPara(sParaTemp,AlipayConfig.sign_type2);
            HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler.getInstance();

            HttpRequest req = new HttpRequest(HttpResultType.BYTES);
            //设置编码集
            req.setCharset(AlipayConfig.input_charset);
            req.setParameters(AlipayUtil.generatNameValuePair(sPara));
            req.setUrl(AlipayConfig.alipay_gateway_new + "_input_charset=" + AlipayConfig.input_charset);
            HttpResponse response = httpProtocolHandler.execute(req,"","");
            if (response == null) {
                return null;
            }

            String strResult = response.getStringResult();

        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 支付宝服务器异步通知
     * @param request
     * @return
     */
    public String AlipayNotify(HttpServletRequest request) throws UnsupportedEncodingException {
        //获取支付宝POST过来反馈信息
        request.setCharacterEncoding("UTF-8");
        Map<String,String> params = new HashMap<String,String>();
        Map requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
            params.put(name, valueStr);
        }

        //获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
        //通知时间通知的发送时间。格式为 yyyy-MM-dd HH:mm:ss
        String notify_time = request.getParameter("notify_time");
        //通知类型
        String notify_type = request.getParameter("notify_type");
        //通知校验类型
        String notify_id = request.getParameter("notify_id");
        //签名方式
        String sign_type = request.getParameter("sign_type");
        //签名
        String sign = request.getParameter("sign");
        //商户网站唯一订单号
        String out_trade_no = request.getParameter("out_trade_no");
        // 商品名称
        String subject = request.getParameter("subject");
        // 支付类型
        String payment_type = request.getParameter("payment_type");
        //支付宝交易号
        String trade_no = request.getParameter("trade_no");
        //交易状态
        String trade_status = request.getParameter("trade_status");
        // 该笔交易创建的时间。格式为yyyy-MM-dd HH:mm:ss。
        String gmt_create = request.getParameter("gmt_create");
        // 该笔交易的买家付款时间。格式为yyyy-MM-dd HH:mm:ss。
        String gmt_payment = request.getParameter("gmt_payment");
        // 该笔交易的买家付款时间。格式为yyyy-MM-dd HH:mm:ss。
        String gmt_close = request.getParameter("gmt_close");
        // 卖家支付宝账号，可以是email和手机号码。
        String seller_email = request.getParameter("seller_email");
        // 买家支付宝账号，可以是Email或手机号码。
        String buyer_email = request.getParameter("buyer_email");
        // 卖家支付宝账号对应的支付宝唯一用户号
        String seller_id = request.getParameter("seller_id");
        // 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
        String buyer_id = request.getParameter("buyer_id");
        //商品单价
        String price = request.getParameter("price");
        //交易金额
        String total_fee = request.getParameter("total_fee");
        //购买数量
        String quantity = request.getParameter("quantity");
        // 商品描述。该笔订单的备注、描述、明细等。对应请求时的body参数，原样通知回来。
        String body = request.getParameter("body");
        // 折扣。支付宝系统会把discount的值加到交易金额上，如果有折扣，本参数为负数，单位为元。
        String discount = request.getParameter("discount");
        // 该交易是否调整过价格。
        String is_total_fee_adjust = request.getParameter("is_total_fee_adjust");
        // 是否在交易过程中使用了红包。
        String use_coupon = request.getParameter("use_coupon");
        /**
         * 退款状态。 REFUND_SUCCESS：退款成功。 全额退款情况：trade_status=
         * TRADE_CLOSED，而refund_status=REFUND_SUCCESS。 非全额退款情况：trade_status=
         * TRADE_SUCCESS，而refund_status=REFUND_SUCCESS。 REFUND_CLOSED：退款关闭。
         */
        String refund_status = request.getParameter("refund_status");
        // 退款时间。卖家退款的时间，退款通知时会发送。格式为yyyy-MM-dd HH:mm:ss。
        String gmt_refund = request.getParameter("gmt_refund");

        //获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//
        if(AlipayNotify.verify(params)){//验证成功
            //请在这里加上商户的业务逻辑程序代码

            //——请根据您的业务逻辑来编写程序（以下代码仅作参考）——

            if(trade_status.equals("TRADE_FINISHED")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            } else if (trade_status.equals("TRADE_SUCCESS")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //付款完成后，支付宝系统发送该交易状态通知
            }

            //——请根据您的业务逻辑来编写程序（以上代码仅作参考）——

            return "success";	//请不要修改或删除

        }else{//验证失败
            return "fail";
        }
    }


    /**
     * 支付宝页面跳转同步通知
     * @param request
     * @return
     */
    public String AlipayReturn(HttpServletRequest request){
        //获取支付宝GET过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        //获取支付宝的通知返回参数
        //成功标示 表示接口调用是否成功,并不表明业务处理结果
        String is_success = request.getParameter("is_success");
        //签名方式
        String sign_type = request.getParameter("sign_type");
        //签名
        String sign = request.getParameter("sign");
        //标志调用哪个接口返回的链接
        String service = request.getParameter("service");
        //通知校验类型
        String notify_id = request.getParameter("notify_id");
        //通知时间
        String notify_time = request.getParameter("notify_time");
        //通知类型
        String notify_type = request.getParameter("notify_type");
        //商户网站唯一订单号
        String out_trade_no = request.getParameter("out_trade_no");
        //支付宝交易号
        String trade_no = request.getParameter("trade_no");
        // 商品名称
        String subject = request.getParameter("subject");
        // 支付类型
        String payment_type = request.getParameter("payment_type");
        //交易状态
        String trade_status = request.getParameter("trade_status");
        // 卖家支付宝账号对应的支付宝唯一用户号
        String seller_id = request.getParameter("seller_id");
        //交易金额
        String total_fee = request.getParameter("total_fee");
        // 商品描述
        String body = request.getParameter("body");


        //获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//

        //计算得出通知验证结果
        boolean verify_result = AlipayNotify.verify(params);

        if(verify_result){//验证成功
            //请在这里加上商户的业务逻辑程序代码

            //——请根据您的业务逻辑来编写程序（以下代码仅作参考）——
            if(trade_status.equals("TRADE_FINISHED") || trade_status.equals("TRADE_SUCCESS")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序
            }

            //该页面可做页面美工编辑
            return "success";
            //——请根据您的业务逻辑来编写程序（以上代码仅作参考）——
        }else{
            //该页面可做页面美工编辑
            return "fail";
        }
    }
}
