package com.mapper;

import com.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MessageMapper {
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
