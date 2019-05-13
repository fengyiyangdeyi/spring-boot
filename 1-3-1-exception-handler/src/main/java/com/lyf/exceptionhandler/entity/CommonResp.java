package com.lyf.exceptionhandler.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口返回
 *
 * @author liyingfeng
 */
@Data
public class CommonResp<T> implements Serializable {
    public static final Integer CODE_SUCCESS = 0;

    public static final Integer CODE_ERROR = -1;

    public static final String MSG_SUCCESS = "操作成功";

    public static final String MSG_FAIL = "操作失败";

    /**
     * 返回码
     */
    @ApiModelProperty(value = "返回码：0-成功、-1-失败、-2-登录超时")
    private Integer code = 0;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String msg = "";

    /**
     * 业务数据
     */
    @ApiModelProperty(value = "业务数据")
    private T data;

    public CommonResp() {

    }

    public CommonResp(T data) {
        this.data = data;
    }

    public CommonResp(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResp(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> CommonResp<T> success(String msg, T data) {
        return new CommonResp<>(CODE_SUCCESS, msg, data);
    }

    public static <T> CommonResp<T> success(T data) {
        return success(MSG_SUCCESS, data);
    }

    public static <T> CommonResp<T> success() {
        return success(null);
    }

    public static <T> CommonResp<T> fail(Integer code, String msg, T data) {
        return new CommonResp<>(code, msg, data);
    }

    public static <T> CommonResp<T> fail(Integer code, String msg) {
        return fail(code, msg, null);
    }

    public static <T> CommonResp<T> fail(String msg) {
        return fail(CODE_ERROR, msg);
    }

    public static <T> CommonResp<T> fail() {
        return fail(MSG_FAIL);
    }

}
