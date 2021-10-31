package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论实体类
 */
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = 4145191340211936448L;
    //评论id
    private Integer commentID;
    //评论内容
    private String commentContent;
    //评论用户id
    private Integer commentUserId;
    //评论文章id
    private Integer commentArticleId;
    //评论发表时间
    private Date commentCreateTime;

}
