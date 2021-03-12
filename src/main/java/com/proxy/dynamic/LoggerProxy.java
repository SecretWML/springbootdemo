package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class LoggerProxy implements InvocationHandler {

    public Object target;

    public LoggerProxy(Object target){
        this.target=target;
    }

    public  <T> T createProxy(){
       return  (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin...");
        Object result = method.invoke(target,args);
        System.out.println("end...");
        return result;
    }
}
