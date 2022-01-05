package me.serliunx.dao;

import me.serliunx.pojo.Reply;

import java.util.List;

public interface ReplyMapper {
    List<Reply> getRepliesOfTopic(Integer topicId);
    int getRepliesNum(Integer topicId);
    int insert(Reply record);
}