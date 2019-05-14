package com.lyf.aop.entity;

import lombok.Data;

/**
 * @Author: LYF
 * @Date: 2019/5/14 9:54
 */

@Data
public class SysLogBO {

    private String className;

    private String methodName;

    private String params;

    private Long exeuTime;

    private String remark;

    private String createDate;
}
