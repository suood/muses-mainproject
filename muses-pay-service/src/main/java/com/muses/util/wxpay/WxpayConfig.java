package com.muses.util.wxpay;

/**
 * Created by xinhuan on 2015/12/7.
 */
public class WxpayConfig {

    //微信分配的公众账号ID（企业号corpid即为此appId）
    public static String appid = "wx89955e7fe5a9ea19";
    //app秘钥
    public static String appsecret = "c321e24501eff198853ed0cccc96d560";
    //微信支付分配的商户号
    public static String mch_id = "1234095802";
    //密钥
    public static String partnerKey = "eZHY3gsCXFUHEtUO6chPvy5mjx4WrnyP";
    //统一下单URL
    public static String unifiedorder  ="https://api.mch.weixin.qq.com/pay/unifiedorder";
    //回调通知地址
    public static String notify_url = "http://123.57.206.88:8080/pay/wxpay/wxNotify";
}
