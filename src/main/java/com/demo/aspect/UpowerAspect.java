package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *  https://www.cnblogs.com/oldboyooxx/p/9245593.html
 * */
@Component
@Aspect
public class UpowerAspect {

    @Pointcut("@annotation(com.demo.annotation.Upower)")
    private void upower() {

    }

    /**
     * 定制一个环绕通知
     * @param joinPoint
     */
    @Around("upower()")
    public void advice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around Begin");
        joinPoint.proceed();//执行到这里开始走进来的方法体（必须声明）
        System.out.println("Around End");
    }

    //当想获得注解里面的属性，可以直接注入改注解
    //方法可以带参数，可以同时设置多个方法用&&
    @Before("upower()")
    public void record(JoinPoint joinPoint) {
        System.out.println("Before");
    }

    @After("upower()")
    public void after() {
        System.out.println("After");
    }
}
