package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Message implements Serializable {

    private static final long serialVersionUID = 8146389752508652762L;

    //留言id
    private int messageId;
    //上一条留言id
    private int preMessageId;
    //留言内容
    private String messageContent;
    //留言创建时间
    private Date messageCreateTime;
    //留言用户id
    private int messageUserId;
    //留言处用户id
    private int messageToUserId;

}
