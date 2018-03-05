package com.cn.by.test.spring;

import javafx.application.Application;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

public class SpringAOPApp {

    @Test
    public void client(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        //测试方法前置，后置
        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());
        //测试环绕
        proxyFactory.addAdvice(new GreetingAroundAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("By");

    }

    @Test
    public void client2(){
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/by/test/spring/spring-aop.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("by");
    }

    @Test
    public void client3(){
        System.out.println("XML的配置方式");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/by/test/spring/spring-aop.xml");
        GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greetingImpl");
        greetingImpl.sayHello("by");
        greetingImpl.goodMorning("Zby");
    }

    //Aspectj
    @Test
    public void client4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/by/test/spring/spring-aop.xml");

        Greeting greeting = (Greeting) context.getBean("greetingImpl");
        greeting.sayHello("jack");
        greeting.sayHi("测试");
        Love love = (Love) greeting;

        love.disPlay("love");
    }
}
