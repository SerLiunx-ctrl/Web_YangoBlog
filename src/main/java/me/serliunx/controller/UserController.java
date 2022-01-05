package me.serliunx.controller;

import me.serliunx.dao.UserMapper;
import me.serliunx.pojo.User;
import me.serliunx.service.TopicService;
import me.serliunx.service.UserService;
import me.serliunx.service.VerificationService;
import me.serliunx.serviceImp.BasicFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Demo UserController
 *
 * @author root
 * @date 2019/9/7
 */
@Controller
public class UserController {

    @Resource(name = "userServiceImp")
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @Resource(name ="verificationServiceImp")
    private VerificationService verificationService;

    @Resource(name = "basicFunctionService")
    private BasicFunctionService basicFunctionService;

    @Resource(name = "topicServiceImp")
    private TopicService topicService;

    //用户登录
    @RequestMapping("/user/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.Login(request,response);
    }
    @RequestMapping("/user/userInfoid/{user.id}")
    public ModelAndView userInfo(@PathVariable("user.id") Integer id) throws Exception{
        ModelAndView returnModel = userService.userInfo(id);
        return returnModel;
    }

    @RequestMapping("/user/updateUser")
    public ModelAndView updateUser(HttpServletRequest request) throws Exception {

        ModelAndView model = userService.updateUser(request);
        return model;
    }

    @RequestMapping("/user/createImgToken")
    public void createImgToken(HttpServletRequest request, HttpServletResponse response) throws Exception{
        verificationService.verificateImgToken(request, response);
    }

    @RequestMapping("/user/cutImg")
    public void cutImg(HttpServletRequest req, HttpServletResponse response, MultipartFile file) throws IllegalStateException, IOException {

        basicFunctionService.getStringFromStream(req, response,file);
    }

    @RequestMapping("/user/regist")
    public ModelAndView regist(HttpServletRequest request, HttpServletResponse response, ModelAndView model, User user) throws Exception{
        System.out.println("用户注册!!!!!");
        ModelAndView returnModel = userService.addUser(request,response,model, user);
        return returnModel;

    }

    @RequestMapping("/user/myTopic")
    public ModelAndView myTopic(HttpServletRequest request) throws Exception {
        ModelAndView model = topicService.UserTopics(request);
        return model;
    }

}
