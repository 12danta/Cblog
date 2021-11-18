package com.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Link implements Serializable {

    private static final long serialVersionUID = -4437986214051027674L;

    //链接id
    private int linkId;
    //链接类型
    private String linkType;
    //链接图标
    private String linkCoin;
    //链接内容
    private String LinkContent;
    //链接用户id
    private int linkUserId;
}
