package com.cn.by.test.spring;

public class LoveImpl implements Love {
    @Override
    public void disPlay(String name) {
        System.out.println("I Love you:" + name);
    }
}
