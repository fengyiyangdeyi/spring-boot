package com.lyf.exceptionhandler.controller;

import com.lyf.exceptionhandler.entity.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LYF
 * @Date: 2019/5/13 15:11
 */
@RestController
public class ExceptionHandlerController {

    @GetMapping("testException")
    public String exceptionHandler() throws Exception {
        if(true){
            throw new Exception("exception");
        }
        return "success";
    }

    @GetMapping("testBusinessException")
    public String businessException() {
        if(true){
            throw new BusinessException("businessException");
        }
        return "success";
    }
}
