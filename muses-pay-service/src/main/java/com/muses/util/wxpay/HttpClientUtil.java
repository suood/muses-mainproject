package com.muses.util.wxpay;


import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by mysgq1 on 15/2/28.
 *
 * Http Client工具类
 * 发起http client 请求
 *
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public final class HttpClientUtil {

    private static final String TYPE_STRING = "string";

    private static final String TYPE_BYTEARRAY = "byte[]";

    private static final String TYPE_STREAM = "stream";

    private static HttpClientUtil instance;

    private HttpClientUtil(){}

    /**
     * 使用默认的页面请求编码：utf-8
     * @return
     */
    public static HttpClientUtil getInstance(){
        return getInstance("UTF-8");
    }

    public static HttpClientUtil getInstance(String urlCharset){
        if(instance == null){
            instance = new HttpClientUtil();
        }
        //设置默认的url编码
        instance.setUrlCharset(urlCharset);
        return instance;
    }

    /**
     * 请求编码，默认使用utf-8
     */
    private String urlCharset = "UTF-8";

    /**
     * @param urlCharset 要设置的 urlCharset。
     */
    public void setUrlCharset(String urlCharset) {
        this.urlCharset = urlCharset;
    }
    /**
     * 获取字符串型返回结果，通过发起http post请求
     * @param targetUrl
     * @param params
     * @return
     * @throws Exception
     */
    public String getResponseBodyAsString(String targetUrl,Map params)throws Exception{

        return (String)setPostRequest(targetUrl,params,TYPE_STRING);
    }

    /**
     * 获取字符数组型返回结果，通过发起http post请求
     * @param targetUrl
     * @param params
     * @return
     * @throws Exception
     */
    public byte[] getResponseBodyAsByteArray(String targetUrl,Map params)throws Exception{

        return (byte[])setPostRequest(targetUrl,params,TYPE_BYTEARRAY);
    }

    /**
     * 将response的返回流写到outputStream中，通过发起http post请求
     * @param targetUrl                 请求地址
     * @param params                    请求参数<paramName,paramValue>
     * @throws Exception
     */
    public void getResponseBodyAsStream(String targetUrl,Map params)throws Exception{
        //response 的返回结果写到输出流
        setPostRequest(targetUrl,params,TYPE_STREAM);
    }

    /**
     * 利用http client模拟发送http post请求
     * @param targetUrl                 请求地址
     * @param params                    请求参数<paramName,paramValue>
     * @return  Object                  返回的类型可能是：String 或者 byte[] 或者 outputStream
     * @throws Exception
     */
    private Object setPostRequest(String targetUrl,Map params,String responseType)throws Exception{
        if(StringUtils.isBlank(targetUrl)){
            throw new IllegalArgumentException("调用HttpClientUtil.setPostRequest方法，targetUrl不能为空!");
        }

        Object responseResult = null;
        HttpClient client = null;
        PostMethod post = null;
        NameValuePair[] nameValuePairArr = null;
        SimpleHttpConnectionManager connectionManager = null;
        try{
            connectionManager =  new SimpleHttpConnectionManager(true);
            //连接超时,单位毫秒
            connectionManager.getParams().setConnectionTimeout(3000);
            //读取超时,单位毫秒
            connectionManager.getParams().setSoTimeout(60000);

            //设置获取内容编码
            connectionManager.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,urlCharset);
            client = new HttpClient(new HttpClientParams(),connectionManager);

            post = new PostMethod(targetUrl);
            //设置请求参数的编码
            post.getParams().setContentCharset(urlCharset);

            //服务端完成返回后，主动关闭链接
            post.setRequestHeader("Connection","close");
            if(params != null){
                nameValuePairArr = new NameValuePair[params.size()];

                Set key = params.keySet();
                Iterator keyIte = key.iterator();
                int index = 0;
                while(keyIte.hasNext()){
                    Object paramName = keyIte.next();
                    Object paramValue = params.get(paramName);
                    if(paramName instanceof String && paramValue instanceof String){
                        NameValuePair pair = new NameValuePair((String)paramName,(String)paramValue);
                        nameValuePairArr[index] = pair;
                        index++;
                    }
                }

                post.addParameters(nameValuePairArr);
            }

            int sendStatus = client.executeMethod(post);

            if(sendStatus == HttpStatus.SC_OK){

                if(StringUtils.equals(TYPE_STRING, responseType)){
                    responseResult = post.getResponseBodyAsString();
                }else if(StringUtils.equals(TYPE_BYTEARRAY, responseType)){
                    responseResult = post.getResponseBody();
                }else if(StringUtils.equals(TYPE_STREAM, responseType)){
                    InputStream tempStream = post.getResponseBodyAsStream();
                    byte[] temp = new byte[1024];
                    int index = -1;
                    while((index = tempStream.read(temp)) != -1){
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //释放链接
            if(post != null){
                post.releaseConnection();
            }

            //关闭链接
            if(connectionManager != null){
                connectionManager.shutdown();
            }
        }

        return responseResult;
    }



    /**
     * 利用http client模拟发送http post请求
     * @param targetUrl                 请求地址
     * @return  Object                  返回的类型可能是：String 或者 byte[] 或者 outputStream
     * @throws Exception
     */
    private Object setPostRequestJSON(String targetUrl,String JSON_STRING,String responseType)throws Exception{
        if(StringUtils.isBlank(targetUrl)){
            throw new IllegalArgumentException("调用HttpClientUtil.setPostRequest方法，targetUrl不能为空!");
        }

        Object responseResult = null;
        HttpClient client = null;
        PostMethod post = null;
        NameValuePair[] nameValuePairArr = null;
        SimpleHttpConnectionManager connectionManager = null;
        try{
            connectionManager =  new SimpleHttpConnectionManager(true);
            //连接超时,单位毫秒
            connectionManager.getParams().setConnectionTimeout(3000);
            //读取超时,单位毫秒
            connectionManager.getParams().setSoTimeout(60000);

            //设置获取内容编码
            connectionManager.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,urlCharset);
            client = new HttpClient(new HttpClientParams(),connectionManager);

            post = new PostMethod(targetUrl);
            StringRequestEntity requestEntity = new StringRequestEntity(
                    JSON_STRING,
                    "application/json",
                    "UTF-8");
            post.setRequestEntity(requestEntity);
            //设置请求参数的编码
            post.getParams().setContentCharset(urlCharset);
            //服务端完成返回后，主动关闭链接
            post.setRequestHeader("Connection","close");
            int sendStatus = client.executeMethod(post);
            if(sendStatus == HttpStatus.SC_OK){
                if(StringUtils.equals(TYPE_STRING, responseType)){
                    responseResult = post.getResponseBodyAsString();
                }else if(StringUtils.equals(TYPE_BYTEARRAY, responseType)){
                    responseResult = post.getResponseBody();
                }else if(StringUtils.equals(TYPE_STREAM, responseType)){
                    InputStream tempStream = post.getResponseBodyAsStream();
                    byte[] temp = new byte[1024];
                    int index = -1;
                    while((index = tempStream.read(temp)) != -1){
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //释放链接
            if(post != null){
                post.releaseConnection();
            }

            //关闭链接
            if(connectionManager != null){
                connectionManager.shutdown();
            }
        }

        return responseResult;
    }
    /**
     * 获取字符串型返回结果，通过发起http post请求
     * @param targetUrl
     * @return
     * @throws Exception
     */
    public String getResponseBodyAsStringJSON(String targetUrl,String json)throws Exception{

        return (String)setPostRequestJSON(targetUrl, json, TYPE_STRING);
    }


    public static String doGet(String url, String charset)
            throws Exception {
    /*
     * 使用 GetMethod 来访问一个 URL 对应的网页,实现步骤: 1:生成一个 HttpClinet 对象并设置相应的参数。
     * 2:生成一个 GetMethod 对象并设置响应的参数。 3:用 HttpClinet 生成的对象来执行 GetMethod 生成的Get
     * 方法。 4:处理响应状态码。 5:若响应正常，处理 HTTP 响应内容。 6:释放连接。
     */
    /* 1 生成 HttpClinet 对象并设置参数 */
        HttpClient httpClient = new HttpClient();
        // 设置 Http 连接超时为5秒
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(5000);
    /* 2 生成 GetMethod 对象并设置参数 */
        GetMethod getMethod = new GetMethod(url);
        // 设置 get 请求超时为 5 秒
        getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
        // 设置请求重试处理，用的是默认的重试处理：请求三次
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,	new DefaultHttpMethodRetryHandler());
        String response = "";
    /* 3 执行 HTTP GET 请求 */
        try {
            int statusCode = httpClient.executeMethod(getMethod);
      /* 4 判断访问的状态码 */
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("请求出错: "+ getMethod.getStatusLine());
            }
      /* 5 处理 HTTP 响应内容 */
            // HTTP响应头部信息，这里简单打印
            Header[] headers = getMethod.getResponseHeaders();
            for (Header h : headers)
                System.out.println(h.getName() + "------------ " + h.getValue());
            // 读取 HTTP 响应内容，这里简单打印网页内容
            byte[] responseBody = getMethod.getResponseBody();// 读取为字节数组
            response = new String(responseBody, charset);
            System.out.println("----------response:" + response);
            // 读取为 InputStream，在网页内容数据量大时候推荐使用
            // InputStream response = getMethod.getResponseBodyAsStream();
        } catch (HttpException e) {
            // 发生致命的异常，可能是协议不对或者返回的内容有问题
            System.out.println("请检查输入的URL!");
            e.printStackTrace();
        } catch (IOException e) {
            // 发生网络异常
            System.out.println("发生网络异常!");
            e.printStackTrace();
        } finally {
      /* 6 .释放连接 */
            getMethod.releaseConnection();
        }
        return response;
    }

    /**
     * @param str
     * @return
     */
    public static InputStream String2Inputstream(String str) throws UnsupportedEncodingException {
        return new ByteArrayInputStream(str.getBytes("UTF-8"));
    }
    public static void main(String[] args) throws Exception {
        /*StringBuffer stringBuffer = new StringBuffer("海尔洗衣机噪声不小，容量也很大。");

        String url = "http://182.92.184.136:12345/ltp";

        long now =System.currentTimeMillis();
        HttpClientUtil util = HttpClientUtil.getInstance("utf-8");
        String resultStr = util.getResponseBodyAsString(url, params);
        System.out.println(System.currentTimeMillis()-now);
        System.out.println(resultStr);*/
//        String json ="{\"sortMode\":\"0\"}";15810030205
//          String json ="{\"categoryId\": \"f5cf6ff94ac35ba4014acd79cd3e07e0-f5cf6ffa4a94ced9014a950802330052-f5cf6ffa4ac33ef4014acd7bece4049f\",\"queryMode\": \"2\",\"sortMode\":\"4\"}";
//        String json ="{\"listOrderNos\":[{\"b201506130990485\"},{\"b201506130990486\"}],\"userId\":\"8ab3cf264d37ffba014d3802116a0002\",\"totalMoney\":\"306\"}";
//        String json ="{\"couponCode\":\"TEST001,TEST002\"}";


        HttpClientUtil util = HttpClientUtil.getInstance("utf-8");
//        String resultStr = util.getResponseBodyAsStringJSON("http://192.168.1.108:8080/mobile/rest/sms/verifyCopon/18610263496", json);


//        String json1 ="{\"couponCode\":\"TEST201,TEST202,TEST203\",\"userId\":\"402888884b2fb3ed014b33774540000e\"}";
//        String resultStr = util.getResponseBodyAsStringJSON("http://localhost:8080/mobile/rest/couponbuyer/addVerifyCode", json1);
//        String resultStr = util.getResponseBodyAsStringJSON("http://localhost:8080/mobile/rest/couponbuyer/addVerifyCodeByUserIdandcouponCode", json1);
//        String resultStr = util.getResponseBodyAsStringJSON("http://117.79.239.194:8080/nlshop/mobile//rest/couponbuyer/addVerifyCodeByUserIdandcouponCode", json1);
//        String resultStr = util.getResponseBodyAsStringJSON("http://localhost:8080/mobile/rest/order/getorderandgoodslistbyorderid/b1fcaa057d7148b983d08dc5249d9fc2/returntype/return", null);
//        System.out.println(util.setPostRequest("http://localhost:8080/mobile/rest/order/getorderandgoodslistbyorderid/b1fcaa057d7148b983d08dc5249d9fc2/return",null,null));
        String url = "http://api.ickd.cn/?id=111721&secret=19acb402714dfa961178001437d6daca&com=zhongtong&nu=762817894160&type=json&encode=utf8";
        System.out.println(util.doGet(url, "utf-8"));
    }

}

