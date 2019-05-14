package com.lyf.mybatis.entity;

import lombok.Data;

/**
 * @Author: LYF
 * @Date: 2019/5/14 11:46
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
