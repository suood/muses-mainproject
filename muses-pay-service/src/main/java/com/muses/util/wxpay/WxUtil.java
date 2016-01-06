package com.muses.util.wxpay;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by xinhuan on 2015/12/7.
 */
public class WxUtil {
    public static String getPackage(TreeMap<String, String> treeMap) {

        String sign = createSign(treeMap);
        treeMap.put("sign", sign);
        StringBuilder xml = new StringBuilder();
        xml = parseXML(treeMap);
        return xml.toString();
    }

    //生成签名
    private static String createSign(TreeMap<String, String> treeMap){

        StringBuilder sb = new StringBuilder();
        for (String key : treeMap.keySet()) {
            sb.append(key).append("=").append(treeMap.get(key)).append("&");
        }
        sb.append("key=" + WxpayConfig.partnerKey);

        String  sign = MD5Util.MD5Encode(sb.toString(), "utf-8")
                .toUpperCase();

        return sign;
    }

    //组装XML报文
    private static StringBuilder parseXML(TreeMap<String, String> treeMap){

        StringBuilder xml = new StringBuilder();
        xml.append("<xml>\n");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            if ("body".equals(entry.getKey()) || "sign".equals(entry.getKey())) {
                xml.append("<" + entry.getKey() + "><![CDATA[").append(entry.getValue()).append("]]></" + entry.getKey() + ">\n");
            } else {
                xml.append("<" + entry.getKey() + ">").append(entry.getValue()).append("</" + entry.getKey() + ">\n");
            }
        }
        xml.append("</xml>");
        return xml;
    }

}
