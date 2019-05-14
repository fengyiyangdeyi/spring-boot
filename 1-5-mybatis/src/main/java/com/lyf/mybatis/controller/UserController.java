package com.lyf.mybatis.controller;

import com.lyf.mybatis.service.UserService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LYF
 * @Date: 2019/5/14 11:20
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/helloUser/{id}")
    public String selectUser(@PathVariable int id) {
        return userService.selectUser(id).toString();

    }

    @RequestMapping("/helloUserXml/{id}")
    public String helloUserXml(@PathVariable int id) {
        log.debug("ddddddddddddddddddd");
        return userService.helloUserXml(id).toString();

    }
}
