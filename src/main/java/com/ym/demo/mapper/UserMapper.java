package com.ym.demo.mapper;

import com.ym.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component("UserDao")
public interface UserMapper {
    public User findUserByUsername(@Param("username") String username);
}
