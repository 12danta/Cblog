package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 */

@Data
public class User implements Serializable{


    private static final long serialVersionUID = -7790271982348244102L;
    //用户id
    private Integer userId;
    //用户名
    private String userName;
    //用户密码
    private String userPassword;
    //用户email
    private String userEmail;
    //用户权限
    private String userRole;
    //用户头像
    private String userAvatar;
    //注册时间
    private Date userRegisterTime;

}
