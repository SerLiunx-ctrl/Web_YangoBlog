package me.serliunx.controller;

import me.serliunx.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class TopicController {

    @Resource(name = "topicServiceImp")
    private TopicService topicService;

    @RequestMapping("/topic/addTopic")
    public ModelAndView addTopic(HttpServletRequest request) throws Exception{
        System.out.println("addTopic**********");
        ModelAndView model = topicService.addTopic(request);
        return model;
    }
}
