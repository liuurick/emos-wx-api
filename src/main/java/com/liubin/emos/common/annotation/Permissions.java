package com.liubin.emos.common.annotation;

import java.lang.annotation.*;

/**
 * @author admin
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Permissions {

    /***
     * 校验参数
     * @return
     */
    String permission();

}
