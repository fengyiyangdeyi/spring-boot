package com.lyf.jackson.controller;

import com.lyf.jackson.entity.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 时间格式处理
 *
 * @Author: LYF
 * @Date: 2019/5/13 16:02
 */
@RestController
@RequestMapping("dataTime")
public class DateTimeController {
    @GetMapping("testReq")
    public String testReq(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {
        System.out.println(date);
        return "success";
    }

    @GetMapping("testResp")
    public Date testResp() {
        //2019-05-13T08:06:19.684+0000
        return new Date();
    }

    @PostMapping("testReqDateTime")
    public String testReqDateTime(@RequestBody DateTime dateTime) {
        System.out.println(dateTime);
        return "success";
    }

    @GetMapping("testRespDateTime")
    public DateTime testRespDateTime() {
        DateTime dateTime = new DateTime();
        dateTime.setDataTime(new Date());
        return dateTime;
    }
}
