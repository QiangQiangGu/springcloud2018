package com.joe.cloud01.aop;

import com.joe.api.entity.Dep;
import com.joe.cloud01.util.RedisUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author QiangQiang Gu
 * @date 2020/5/29 10:15
 */

@Aspect
@Component
public class QueryAop {
    @Autowired
    RedisUtil redisUtil;


    @Around("execution(* com.joe.cloud01.service.impl.DepServiceImpl.queryById(..))")
    public Object around(ProceedingJoinPoint point) {
        Object[] args = point.getArgs();
        String key = "dep" + args[0].toString();
        Object obj = redisUtil.get(key);
        if (obj != null) {
            return obj;
        }
        Dep dep = proceed(point);
        redisUtil.set(key, dep);
        return dep;
    }

    public Dep proceed(ProceedingJoinPoint point) {
        try {
            Object proceed = point.proceed();
            return (Dep) proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
