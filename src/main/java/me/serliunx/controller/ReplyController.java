package me.serliunx.controller;

import me.serliunx.pojo.Reply;
import me.serliunx.service.ReplyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Demo ReplyService
 *
 * @author root
 * @date 2019/9/8
 */
@Controller
public class ReplyController {

    @Resource(name = "replyServiceImp")
    private ReplyService replyService;

    @RequestMapping("/reply/addReply")
    public ModelAndView addReply(Reply reply) throws Exception{

        //使用对象参数绑定
        ModelAndView model = replyService.addReply(reply);
        return model;
    }
}
