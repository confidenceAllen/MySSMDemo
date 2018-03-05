package com.cn.by.test.spring;

import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {

    @Around("execution(* com.cn.by.test.spring.Greeting.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("我排在proceed方法前面");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("我是环绕Around方法:");

        return obj;
    }


    @Before("execution(* com.cn.by.test.spring.Greeting.*(..))")
    public void before(){
        System.out.println("我是before前置方法，我排第一");
    }

    @After("execution(* com.cn.by.test.spring.Greeting.*Hi(..))")
    public void after(){
        System.out.println("我是After方法：我应该最后面");
    }

    @DeclareParents(value = "com.cn.by.test.spring.GreetingImpl",defaultImpl = LoveImpl.class)
    private Love love;
}
