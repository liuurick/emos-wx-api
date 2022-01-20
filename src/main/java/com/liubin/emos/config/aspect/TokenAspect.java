package com.liubin.emos.config.aspect;


import com.liubin.emos.common.util.R;
import com.liubin.emos.config.shiro.ThreadLocalToken;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Aspect
@Component
public class TokenAspect {

    @Resource
    private ThreadLocalToken threadLocalToken;

    @Pointcut("execution(public * com.liubin.emos.controller.*.*(..)))")
    public void aspect() {

    }

    @Around("aspect()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        // 方法执行结果
        R r = (R) point.proceed();
        String token = threadLocalToken.getToken();
        // 如果ThreadLocal中存在Token，说明是更新的Token
        if (token != null) {
            // 往响应中放置Token
            r.put("token", token);
            threadLocalToken.clear();
        }
        return r;
    }
}
