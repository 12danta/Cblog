package com.service.impl;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(noRollbackFor = Exception.class)
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    @Transactional(noRollbackFor = Exception.class)
    public void deleteUserById(Integer userId) {
        userMapper.deleteUserById(userId);
    }

    @Override
    public User selectUserById(Integer userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    @Transactional(noRollbackFor = Exception.class)
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
