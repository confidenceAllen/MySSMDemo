package com.cn.by.test.spring;

import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello：" + name);
    }

    @Override
    public void sayHi(String name) {
        System.out.println("我是GreetingImpl的Hi方法:"+name);
    }

    public void goodMorning(String name){
        System.out.println("Good Morning!" + name);
    }

    public void goodNight(String name){
        System.out.println("Good Night" + name);
    }
}
