package com.muses.web.mobile.page.controller;

import com.github.pagehelper.PageInfo;
import com.muses.data.model.Banner;
import com.muses.service.MusesTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Alexander on 15/11/26.
 */
@Controller
public class MusesTestController {
    @Autowired
    private MusesTestService musesTestService;
    @RequestMapping(value = "/musesdemo", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public   String demo( HttpServletRequest request) {
        PageInfo<Banner> page = musesTestService.getPageBanner(request);
        request.setAttribute("page",page);
        return "index";
    }

}
