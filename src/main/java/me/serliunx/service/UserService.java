package me.serliunx.service;

import me.serliunx.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UserService {
    //使用json方式登录,所以使用request,response
    boolean Login(HttpServletRequest request, HttpServletResponse response) throws IOException;
    //登陆
    ModelAndView quit(HttpServletRequest request, ModelAndView model) throws Exception;
    //详情
    ModelAndView userInfo(@PathVariable("user.id") Integer id) throws Exception;
    //更新
    ModelAndView updateUser(HttpServletRequest request) throws Exception;
    //注册
    ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, ModelAndView model, User user) throws Exception;
}
