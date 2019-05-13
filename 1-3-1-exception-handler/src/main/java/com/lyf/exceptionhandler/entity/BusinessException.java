package com.lyf.exceptionhandler.entity;

import lombok.Data;

/**
 * @author liyingfeng
 */
@Data
public class BusinessException extends RuntimeException {

    private Integer code = -1;

    private Object busiData;

    public BusinessException(){
        super();
    }

    public BusinessException(Integer code){
        super();
        this.code = code;
    }

    public BusinessException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause){
        super(message, cause);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause, Object busiData){
        super(message, cause);
        this.code = code;
        this.busiData = busiData;
    }

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    public BusinessException(Throwable cause){
        super(cause);
    }

    protected BusinessException(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
