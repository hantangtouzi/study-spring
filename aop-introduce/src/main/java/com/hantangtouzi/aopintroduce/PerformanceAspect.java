package com.hantangtouzi.aopintroduce;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author WilliamChang.
 * Created on 2019-06-22 07:03:09
 */

@Component
@Aspect
public class PerformanceAspect {

    @Around(value = "execution(* com.hantangtouzi.aopintroduce.UserDaoImpl.*(..))")
    public Object bench(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Start time: " + proceedingJoinPoint.getSignature().getName());
        long begin = System.currentTimeMillis();
        Object object = proceedingJoinPoint.proceed();
        System.out.println("End time: " + proceedingJoinPoint.getSignature().getName());
        System.out.println("共花费了" + (System.currentTimeMillis() - begin) + "毫秒！");
        return object;
    }
}
