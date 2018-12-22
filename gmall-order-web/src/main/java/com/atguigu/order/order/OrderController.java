package com.atguigu.order.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.impl.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 11543 on 2018/12/17.
 */
@Controller
public class OrderController {

    @Reference
    UserinfoService userinfoService;
    @RequestMapping("getAddress")
    public UserAddress getUserAddress(String userId){
        return userinfoService.getUserById(userId);
    }
}
