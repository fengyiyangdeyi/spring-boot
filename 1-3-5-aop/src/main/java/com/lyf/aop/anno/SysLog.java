package com.lyf.aop.anno;


import java.lang.annotation.*;

/**
 * @Author: LYF
 * @Date: 2019/5/14 9:58
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
