package me.serliunx.service;

import me.serliunx.pojo.Reply;
import org.springframework.web.servlet.ModelAndView;

public interface ReplyService {
    ModelAndView addReply(Reply reply) throws Exception;
}
