package me.serliunx.controller;

import me.serliunx.service.TabService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class TabController {


    @Resource(name="tabServiceImp")
    private TabService tabService;

    @RequestMapping("/tab/{tab.tabNameEn}")
    public ModelAndView selectTab(@PathVariable("tab.tabNameEn") String type){

        System.out.println("type ="+type);
        //进入特定板块
        ModelAndView model = tabService.getByTabNameEn(type);

        return model;
    }
}
