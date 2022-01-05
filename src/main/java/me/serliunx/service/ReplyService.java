package me.serliunx.service;

import me.serliunx.pojo.Reply;
import org.springframework.web.servlet.ModelAndView;

/**
 * Demo ReplyService
 *
 * @author root
 * @date 2019/9/10
 */
public interface ReplyService {
    ModelAndView addReply(Reply reply) throws Exception;
}
