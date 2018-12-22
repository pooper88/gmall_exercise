package com.atguigu.gmall.controller;

import com.atguigu.gmall.bean.User;
import com.atguigu.gmall.service.impl.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 11543 on 2018/12/16.
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> getAll(){
        return userinfoService.listUsers();
    }
}
