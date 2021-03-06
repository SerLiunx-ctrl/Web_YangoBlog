package me.serliunx.serviceImp;

import me.serliunx.dao.ReplyMapper;
import me.serliunx.pojo.Reply;
import me.serliunx.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Service(value ="replyServiceImp")
public class ReplyServiceImp implements ReplyService {

    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public ModelAndView addReply(Reply reply) throws Exception {
        // TODO Auto-generated method stub
        //为评论动态添加一个大小合适的边框
        int size = reply.getContent().length();


        int hight = ((size/87)*10)+170;
        reply.setDevice(hight+"");

        reply.setCreateTime(new Date());
        reply.setUpdateTime(new Date());
        System.out.println(reply);

        int insert = replyMapper.insert(reply);
        System.out.println(insert);
        ModelAndView model = new ModelAndView("redirect:/forword/toDetails?topicId="+reply.getTopicId());

        return model;
    }

}
