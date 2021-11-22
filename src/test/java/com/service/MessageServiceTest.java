package com.service;

import com.base.basetest;
import com.entity.Message;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class MessageServiceTest extends basetest {
    @Autowired
    private MessageService messageService;

    @Test
    public void selectMessageById(){
        System.out.println(messageService.selectMessageById(1));
    }

    @Test
    public void listMessageByUser(){
        List list;
        list = messageService.listMessageByUser(1);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    @Test
    public void deleteMessageById(){
        messageService.deleteMessageById(1);
    }

    @Test
    public void insertMessage(){
        Message message = new Message();
        message.setMessageContent("留言测试");
        message.setPreMessageId(1);
        message.setMessageUserId(1);
        message.setMessageToUserId(23);
        message.setMessageCreateTime(new Date());
        messageService.insertMessage(message);
    }
}
