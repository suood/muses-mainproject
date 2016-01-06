package com.muses.controller;

import com.muses.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xinhuan on 2015/12/4.
 */
@Controller
public class AlipayController {
    @Autowired
    private AlipayService alipayService;

    /**
     * 手机wap提交支付宝支付表单
     * @param request
     * @param response
     */
    @RequestMapping(value = "/alipay/alipaysubmitwap", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody void AlipaySubmitWap(HttpServletRequest request,HttpServletResponse response){
        response.setCharacterEncoding("GBK");
        response.setContentType("text/html");
        String result = alipayService.AlipaySubmitWap(request);
        try {
            response.getWriter().print(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 支付宝服务器异步通知
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/alipay/alipaynotify", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public void AlipayNotify(HttpServletRequest request,HttpServletResponse response) throws IOException {
        try {
            String result = alipayService.AlipayNotify(request);
            response.getWriter().print(result);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print("fail");
        }
    }

    /**
     * 支付宝页面跳转同步通知
     * 用户支付完成后看到一个支付宝提示成功的页面，该页面会停留几秒，然后会自动跳转回商户指定的同步通知页面
     * @param request
     */
    @RequestMapping(value = "/alipay/alipayreturn", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public String AlipayReturn(HttpServletRequest request){
        String result = alipayService.AlipayReturn(request);
        if("success".equals(result)){//支付成功跳转的页面
            return "successPage" ;
        } else {//支付失败跳转的页面
            return "failPage";
        }
    }
}
