package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.User;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.mapper.UserAdderssMapper;
import com.atguigu.gmall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 11543 on 2018/12/16.
 */
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserinfoService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    UserAdderssMapper userAdderssMapper;

    @Override
    public List<User> listUsers() {
        return userMapper.selectAll();
    }

    @Override
    public UserAddress getUserById(String userId) {
        User user = new User();
        user.setId(userId);
        return userMapper.select(user).get(0);
    }
}
