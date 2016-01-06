package com.muses.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.muses.data.mapper.BannerMapper;
import com.muses.data.model.Banner;
import com.muses.data.model.BannerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Alexander on 15/11/26.
 */
@Service
public class MusesTestService {
    @Autowired
    private BannerMapper bannerMapper;

    public PageInfo getPageBanner(HttpServletRequest req){
        PageHelper.startPage(1,10,true);
        List<Banner> list = bannerMapper.selectByExample(new BannerExample());
        PageInfo<Banner> page = new PageInfo(list);
        return page;
    }
}
