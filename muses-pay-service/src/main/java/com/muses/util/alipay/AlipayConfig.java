package com.muses.util.alipay;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.3
 *日期：2012-08-10
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
	
 *提示：如何获取安全校验码和合作身份者ID
 *1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 *3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”

 *安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 *解决方法：
 *1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 *2、更换浏览器或电脑，重新登录查询。
 */

public class AlipayConfig {
    /**
     * 支付宝提供给商户的服务接入网关URL(新)
     */
    public static String alipay_gateway_new = "https://mapi.alipay.com/gateway.do?";
    //服务器异步通知页面路径
    public static String notify_url = "http://www.xinhuan.mobi/alipay.wap.create.direct.pay.by.user-JAVA-UTF-8/notify_url.jsp";
    //需http://格式的完整路径，不能加?id=123这类自定义参数

    //页面跳转同步通知页面路径
    public static String return_url = "http://www.xinhuan.mobi/alipay.wap.create.direct.pay.by.user-JAVA-UTF-8/return_url.jsp";
    //需http://格式的完整路径，不能加?id=123这类自定义参数，不能写成http://localhost/

    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //合作身份者ID，以2088开头由16位纯数字组成的字符串
    public static String partner = "2088412596660472";

    //收款支付宝账号，以2088开头由16位纯数字组成的字符串
    public static String seller_id = partner;
    // 商户的私钥
    public static String private_key = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJxkzkBE16um0XH3fLvecA/qbfxZPl9Vnd0rQm7gvvlYpFDmrtX21Otchd3oJVUejw/o/nt69MkXvkuNeXIlZ/Meaf1JNkRF8/pSPybnbXhiLwdztG7ifJU+ne1pHIRxPv6TIgctIQoVm3LA5dFvP5Nubvp0VkfIlfQlW4psJnk3AgMBAAECgYAYKzv0kq8Bx/X2Ntj/75BB5Wi55tDMyt5qn5TUrcbVoe1C02ORjWO6O8I0WPvr+50ASHGLg6TwrsqpwmNSUJWPrvs9VqZ/tRmSNuLHgZ+dShy4dv+YoG+0EwGD/o/lIHmD0D+UJAJLZYLjZ8rUN57k7rE2GFWxWfSnm76rkxnwAQJBAMibzsyg+BXbi5wRWMl0eLdjuWfqkBZ4OXc1L4AhBVjYm7JqtPwoh6KLvN8LXGtVF7ZI15auvdeT4N/OoxMvMoECQQDHk6IanaE6YDwlrG4oTsORD/3gT75xNzOsK+bBQCe7AzGyHyWdMYxc3IcahGpwOQdOcG3Y6Gf6j/0Erxg869+3AkBDQNDUk0Z4dXDZcotUhmKOALXAm8eQcN+7Ei6Jgwh636ta5iEkxCWsnbJFCFcEeLOJXeRA1PY6Fo52GZ1cKh+BAkAIPx1vpBvJYbiahel3WOnT0KlY33KrEvDbqGS8j34UyCkBhy/yst1t6N7cRaRwRqr6nsKrN880F0cJLoL94XE5AkEAvtIHSgd1zt2+XNODfrLBAAIYs6R5tOD+h849SzDrzOsmiByOfQWsamCMgthlb5rA4sP5RfeKNa19v+k8Rx/+4g==";

    // 支付宝的公钥，无需修改该值
    public static String ali_public_key  = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

    //↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑


    // 调试用，创建TXT日志文件夹路径
    public static String log_path = "D:\\";

    // 字符编码格式 目前支持 gbk 或 utf-8
    public static String input_charset = "utf-8";

    // 签名方式 不需修改
    public static String sign_type = "RSA";

    // 签名方式 不需修改
    public static String sign_type2 = "MD5";

}
