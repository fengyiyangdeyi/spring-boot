package com.lyf.fastjson.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.lyf.fastjson.entity.User;

/**
 * @Author: LYF
 * @Date: 2019/5/13 17:54
 */
public class FastjsonUtils {
    public static void main(String[] args) {
        User user=new User();
        user.setName("LIli");
        String s = JSON.toJSONString(user);
        System.out.println(s);

        User user1 = JSON.parseObject(s, User.class);
        System.out.println(user1.getName());

//        //有泛型
//        User user2 = JSON.parseObject(s, new TypeReference<User<String>>() {
//        });
//        System.out.println(user2.getName());


    }
}
