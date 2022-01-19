package com.liubin.emos.common.annotation;

import java.lang.annotation.*;


/**
 * @author liubin
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebLog {

    /**
     * 日志描述信息
     *
     * @return
     */
    String description() default "";
}
