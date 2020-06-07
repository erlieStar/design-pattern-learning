package com.javashitang.structural.proxy.v4;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class RequestCtrlCallback implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object =  methodProxy.invokeSuper(o, objects);
        System.out.println("reques cost :" + (System.currentTimeMillis() - startTime));
        return object;
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new RequestCtrlCallback());

        UserService proxy = (UserService)enhancer.create();
        // welcome sir
        // reques cost :25
        proxy.request();
    }
}
