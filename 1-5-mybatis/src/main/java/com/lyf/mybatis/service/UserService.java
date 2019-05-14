package com.lyf.mybatis.service;

import com.lyf.mybatis.dao.UserMapper;
import com.lyf.mybatis.entity.Person;
import com.lyf.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: LYF
 * @Date: 2019/5/14 11:19
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }

    public User helloUserXml(int id) {
        return userMapper.sel(id);
    }

}
