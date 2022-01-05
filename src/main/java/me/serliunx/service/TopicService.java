package me.serliunx.service;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TopicService {

    //渲染首页
    public ModelAndView processIndex();
    //渲染帖子页面
    ModelAndView processDetails(HttpServletRequest request) throws Exception;
    //发帖
    ModelAndView addTopic(HttpServletRequest request)throws Exception;

    //查找用户的帖子
    ModelAndView UserTopics(HttpServletRequest request)throws Exception;
}
