package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.User;
import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * Created by 11543 on 2018/12/16.
 */
public interface UserinfoService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<User> listUsers();

    UserAddress getUserById(String userId);
}
