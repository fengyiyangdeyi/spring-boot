package com.lyf.fastjson.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @author liyingfeng
 */
@Data
public class User {
    private Long id;
    @JSONField(name = "myName")
    private String name;
    private Integer age;
    /**
     * fastjson时间返回默认时间戳1557740213079
     */
    private Date data;

    @JSONField(format="yyyy-MM-dd")
    private Date formatDate;
}
