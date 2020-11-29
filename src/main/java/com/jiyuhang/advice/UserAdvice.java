package com.jiyuhang.advice;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.aopalliance.intercept.MethodInterceptor;

import java.util.Date;

public class UserAdvice implements  MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("============ aop 环绕通知开始==============");
        long beginTime = new Date().getTime();
        Object result = methodInvocation.proceed();
        long endTime = new Date().getTime();
        System.out.println("Method:"+ methodInvocation.getMethod().getName()+" process time "+ (endTime-beginTime)+ " ms");
        System.out.println("============ aop 环绕通知结束==============");
        return result;
    }
}
