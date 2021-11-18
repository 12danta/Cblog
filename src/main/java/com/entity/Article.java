package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章实体类
 */
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = -7143966761773238169L;
    //文章id
    private Integer articleId;
    //文章题目
    private String articleTitle;
    //文章内容
    private String articleContent;
    //文章状态
    private Integer articleStatus;
    //文章摘要
    private String articleSummary;
    //文章浏览量
    private Integer articleViewCount;
    //文章缩略图
    private String articleThumbNail;
    //文章作者id
    private Integer articleUserId;
    //文章创建时间
    private Date  articleCreateTime;
    //文章修改时间
    private Date articleUpdateTime;

}
