<%--
  Created by IntelliJ IDEA.
  User: xinhuan
  Date: 2015/12/7
  Time: 16:16
  微信支付生成二维码
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<html>
<head>
    <title></title>
    <script src="<%=basePath%>js/qrcode.js"></script>
</head>
<body>

<div align="center" id="qrcode">
  <p >
    微信支付二维码${code_url}
    <br><br>
  </p>
</div>
</body>

<script>
  //这个地址是Demo.java生成的code_url,这个很关键
  //var url = "weixin://wxpay/bizpayurl?pr=IrbYjQm";

  var url = "${code_url}";
  //参数1表示图像大小，取值范围1-10；参数2表示质量，取值范围'L','M','Q','H'
  var qr = qrcode(10, 'M');
  qr.addData(url);
  qr.make();
  var dom=document.createElement('DIV');
  dom.innerHTML = qr.createImgTag();
  var element=document.getElementById("qrcode");
  element.appendChild(dom);
</script>
</html>
