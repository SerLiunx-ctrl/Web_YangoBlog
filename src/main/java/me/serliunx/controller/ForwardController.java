package me.serliunx.controller;

import me.serliunx.dao.UserMapper;
import me.serliunx.pojo.User;
import me.serliunx.service.TabService;
import me.serliunx.service.TopicService;
import me.serliunx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ForwardController
{


    @Resource(name = "topicServiceImp")
    private TopicService topicService;

    @Resource(name = "userServiceImp")
    private UserService userService;

    @Resource(name = "tabServiceImp")
    private TabService tabService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public ModelAndView RenderingIndex(){

        ModelAndView modelAndView = topicService.processIndex();

        return modelAndView;
    }

    @RequestMapping("/forword/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/forword/toRegist")
    public String toRegisttoRegist(){

        return "regist";
    }

    @RequestMapping("/forword/toEditUser/{user.id}")
    public ModelAndView toEditUser(@PathVariable("user.id") Integer id)throws Exception{
        ModelAndView model = new ModelAndView("editUser");
        User user = userMapper.selectByPrimaryKey(id);
        model.addObject("user", user);
        return model;
    }

    @RequestMapping("/forword/toDetails")
    public ModelAndView toDetails(HttpServletRequest request) throws Exception{
        System.out.println("toDetails..................................................");
        ModelAndView processIndex = topicService.processDetails(request);

        return processIndex;
    }


    @RequestMapping("/forword/toNew")
    public ModelAndView toNew(){
        System.out.println("toNew.....................");
        ModelAndView model = tabService.getAllTabs();
        return model;
    }
}
