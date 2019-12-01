package com.ym.demo.service.impl;

import com.ym.demo.entity.User;
import com.ym.demo.mapper.UserMapper;
import com.ym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }
}
