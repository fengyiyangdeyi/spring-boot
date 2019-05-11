package com.lyf.swagger.controllerscan;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("scan")
public class ScanController {

    @ApiOperation(value = "测试扫描此目录", notes = "测试扫描此目录2")
    @GetMapping
    public String test() {
        return "success";
    }
}
