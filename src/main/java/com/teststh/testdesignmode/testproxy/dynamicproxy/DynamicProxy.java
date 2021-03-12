package com.teststh.testdesignmode.testproxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理   例如：加日志
 *
 * 代理类 实现 InvocationHandler 的invoke()
 *
 * 提供方法 获取代理类class Proxy.newProxyInstance
 *
 * 外层调用动态代理类的方法实际会调用到 invoke()
 *
 *
 *  静态代理通俗点讲就是自己手写一个代理类，而动态代理则不用我们手写，而是依赖于java反射机制
 *  静态代理通常只代理一个类，动态代理是代理一个接口下的多个实现类
 *  动态代理代理的是接口
 *    比如：目标对象中有很多方法都需要加日志
 *      静态代理：需要代理类实现多个方法，在其中加上日志
 *      动态代理：invoke 方法可以对 所有方法进行统一包装
 *
 *
 * */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 获取被代理接口实例对象
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        // 类加载器
        // 让代理对象和目标对象实现相同接口
        // 代理对象的方法最终都会被JVM导向它的invoke方法
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

        //本质是拷贝了一份和接口一样的class，并且可以实例化 （接口不可以实例化）
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //而在调用每个代理类每个方法的时候，都用反射去调h的invoke方法(也就是我们自定义的InvocationHandler的子类中重写的invoke方法)，
        // 用参数传递了代理类实例、接口方法、调用参数列表，这样我们在重写的invoke方法中就可以实现对所有方法的统一包装了。
        System.out.println("Do something before");
        Object result = method.invoke(target, args);
        System.out.println(result);
        System.out.println("Do something after");
        return result;
    }
}
