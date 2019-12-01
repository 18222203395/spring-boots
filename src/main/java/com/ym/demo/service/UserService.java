package com.ym.demo.service;

import com.ym.demo.entity.User;

public interface UserService {
    public User findUserByUsername(String username);
}
