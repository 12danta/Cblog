package com.service.impl;

import com.entity.Message;
import com.mapper.MessageMapper;
import com.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public Message selectMessageById(Integer messageId) {
        return messageMapper.selectMessageById(messageId);
    }

    @Override
    public List<Message> listMessageByUser(Integer userId) {

        return messageMapper.listMessageByUser(userId);

    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteMessageById(Integer messageId) {
        messageMapper.deleteMessageById(messageId);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertMessage(Message message) {
        messageMapper.insertMessage(message);
    }
}
