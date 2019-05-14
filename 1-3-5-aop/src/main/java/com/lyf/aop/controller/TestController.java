package com.lyf.aop.controller;

import com.lyf.aop.anno.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LYF
 * @Date: 2019/5/14 10:05
 */

@RestController
public class TestController {

    @SysLog("测试")
    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        return name;
    }
}
