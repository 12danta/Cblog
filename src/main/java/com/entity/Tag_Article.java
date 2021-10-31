package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Article和tag的关联实体类
 */
@Data
public class Tag_Article implements Serializable {

    private static final long serialVersionUID = -743540502957877594L;

    //文章id
    private Integer ArticleId;
    //tag id
    private Integer TagId;

}
