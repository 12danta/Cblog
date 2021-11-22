package com.service;

import com.entity.User;

public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 根据id删除用户
     * @param userId
     */
    void deleteUserById(Integer userId);

    /**
     * 根据id查找用户
     */
    User selectUserById(Integer userId);

    /**
     * 修改用户
     * @param user
     */
    void updateUser(User user);
}
