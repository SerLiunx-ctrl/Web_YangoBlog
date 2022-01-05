package me.serliunx.service;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public interface TabService {
    ModelAndView getAllTabs();

    ModelAndView getByTabNameEn(String type);

}
