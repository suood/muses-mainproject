package com.muses.web.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alexander on 16/1/6.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String toLogin(){
        return "/admin/login";
    }
}
