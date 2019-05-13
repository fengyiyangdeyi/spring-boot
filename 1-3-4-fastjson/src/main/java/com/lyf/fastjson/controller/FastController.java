package com.lyf.fastjson.controller;

import com.alibaba.fastjson.annotation.JSONField;
import com.lyf.fastjson.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: LYF
 * @Date: 2019/5/13 17:29
 */
@RestController
@RequestMapping("fast")
public class FastController {

    @GetMapping
    public User test(){
        User user = new User();
        user.setName("LiLi");
        user.setData(new Date());
        user.setFormatDate(new Date());
        return user;
    }

    @GetMapping("testFormatReq")
    public String testFormatReq(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date){
        System.out.println(date);
        return "success";
    }
}
