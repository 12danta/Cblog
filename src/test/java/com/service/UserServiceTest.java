package com.service;

import com.base.basetest;
import com.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class UserServiceTest extends basetest {

    @Autowired
    private UserService userService;
    User user = new User();

    @Test
    public void insertUser(){

        user.setUserName("user2");
        user.setUserPassword("123456");
        user.setUserBio("学生");
        user.setUserAvatar("12.png");
        user.setUserRegisterTime(new Date());
        user.setUserEmail("123@hotmail.com");
        user.setAboutUser("24岁，是学生");
        user.setUserRole("0");
        userService.insertUser(user);
    }

    @Test
    public void deleteUserById(){
        userService.deleteUserById(2);
    }

    @Test
    public void selectUserById(){
        System.out.println(userService.selectUserById(2));
    }

    @Test
    public void UppdateUser(){
        user.setUserBio("修改yyytest");

        userService.updateUser(user);
    }
}
