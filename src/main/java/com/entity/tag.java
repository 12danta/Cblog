package com.entity;

import lombok.Data;

import java.io.Serializable;
/**
 * tag实体类
 */
@Data
public class tag implements Serializable {

    private static final long serialVersionUID = 3311570148994461661L;

    //tag id
    private Integer tagId;
    //tag 姓名
    private String tagName;
}
