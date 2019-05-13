package com.lyf.exceptionhandler.config.exceptionhandler;

import com.lyf.exceptionhandler.entity.BusinessException;
import com.lyf.exceptionhandler.entity.CommonResp;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LYF
 * @Date: 2019/5/13 15:09
 */
@ControllerAdvice
public class CommonExceptionHandler {

    /**
     * 拦截Exception类的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(Exception e) {
        Map<String, Object> result = new HashMap<>();
        result.put("respCode", "9999");
        result.put("respMsg", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result;
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public CommonResp businessExceptionHandler(BusinessException e) {
        CommonResp result = new CommonResp();
        result.setCode(e.getCode());
        result.setMsg(e.getMessage());
        return result;
    }
}
