package com.lyf.jackson.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: LYF
 * @Date: 2019/5/13 16:10
 */
@Data
public class DateTime {


    /**
     * JsonFormat：用于返参
     *  也可以在配置文件中加，但没有JsonFormat优先能高
     * DateTimeFormat：用于入参
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH-mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dataTime;
}
