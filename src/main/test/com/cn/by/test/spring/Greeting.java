package com.cn.by.test.spring;

import org.springframework.stereotype.Component;

@Component
public interface Greeting {

    void sayHello(String name);

    void sayHi(String name);
}
