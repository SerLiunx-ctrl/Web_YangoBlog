package me.serliunx.dao;

import me.serliunx.pojo.Topic;

import java.util.List;

public interface TopicMapper {
    //返回话题与用户的多个实体类
    List<Topic> listTopicsAndUsers();
    //获取主题总数
    int getTopicsNum();
    //获取最热话题
    List<Topic>  listMostCommentsTopics();
    //点击量+1
    int clickAddOne(Integer id);
    //id查询
    Topic selectTopicById(Integer id);
    void insertTopicReturnId(Topic topic);
    List<Topic> listTopicsAndUsersOfTab(Integer tabId);
    List<Topic> selectUserTopic(Integer userId);
}