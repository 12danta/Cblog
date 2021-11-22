package com.service;

import com.entity.Message;

import java.util.List;

public interface MessageService {

    /**
     * 根据id查询留言
     * @param messageId
     * @return
     */
    Message selectMessageById(Integer messageId);

    /**
     * 根据用户获取留言列表
     * @param userId
     * @return
     */
    List<Message> listMessageByUser(Integer userId);

    /**
     * 根据id删除留言
     * @param messageId
     */
    void deleteMessageById(Integer messageId);

    /**
     * 增加留言
     * @param message
     */
    void insertMessage(Message message);


}
