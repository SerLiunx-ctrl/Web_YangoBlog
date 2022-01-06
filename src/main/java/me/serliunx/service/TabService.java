package me.serliunx.service;

import org.springframework.web.servlet.ModelAndView;

public interface TabService {
    ModelAndView getAllTabs();
    ModelAndView getByTabNameEn(String type);
}
