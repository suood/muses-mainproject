package com.muses.controller;

import com.muses.service.WxpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xinhuan on 2015/12/7.
 */
@Controller
public class WxpayController {
    @Autowired
    private WxpayService wxpayService;


    /**
     * 选择微信支付提交表单 生成二维码页面
     * @param request
     * @return
     */
    @RequestMapping(value = "/wxpay/native_unifiedOrder", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public String native_unifiedOrder(HttpServletRequest request){
        String code_url = wxpayService.unifiedOrder(request);
        if(code_url != null && !"".equals(code_url)){
            request.setAttribute("code_url",code_url);
        }
        return "wxpay/native_unifiedOrder";
    }

    /**
     * 微信支付商品表单页面
     * @param request
     * @return
     */
    @RequestMapping(value = "/wxpay/wxSubmit", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public String wxSubmit(HttpServletRequest request){

        return "wxpay/wxSubmit";
    }

    /**
     * 微信回调方法
     * @param request
     * @param response
     */
    @RequestMapping(value = "/wxpay/wxNotify", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public void wxNotify(HttpServletRequest request,HttpServletResponse response){
        String result = "fail";
        try {
            result = wxpayService.wxNotify(request);
            response.getWriter().print(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
