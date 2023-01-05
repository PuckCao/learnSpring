package com.cao.see.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Puck Cao
 * @date 2023/1/5 6:51 PM
 */
@Slf4j
@Component
@Aspect
public class UseTime {

    @Pointcut("@annotation(com.cao.see.aop.UseTimeIntercepter)")
    private void useTime(){
    }


    @Around("useTime()")
    public Object cacuTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long l = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
            System.out.println("消耗"+(System.currentTimeMillis() - l));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return proceedingJoinPoint.proceed();
    }
}
