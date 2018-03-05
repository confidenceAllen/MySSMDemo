package com.cn.by.test.spring;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

@Component
public class LoveAdvice extends DelegatingIntroductionInterceptor implements Love{
    @Override
    public void disPlay(String name) {
        System.out.println("Heart Impl,Name:"+name);
    }

    public Object invoke(MethodInvocation invocation) throws Throwable{
        return super.invoke(invocation);
    }
}
