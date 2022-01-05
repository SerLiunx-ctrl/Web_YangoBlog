package me.serliunx.controller;

import me.serliunx.service.CheckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CheckController {


    @Resource(name="checkServiceImp")
    private CheckService checkServiceImp;

    @RequestMapping("/check/checkUser")
    public void checkUser(HttpServletRequest request, HttpServletResponse response) throws Exception{

        checkServiceImp.checkUser(request, response);
    }

}
