package com.lyf.restful.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {
    @ApiModelProperty(value = "唯一id")
    private Long id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "年龄")
    private Integer age;
}
