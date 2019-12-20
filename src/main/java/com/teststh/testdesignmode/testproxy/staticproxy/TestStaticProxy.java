package com.teststh.testdesignmode.testproxy.staticproxy;

/***
 *
 *  测试静态代理 - 例如：加日志
 *
 *  interface A
 *     1.实现类 A1
 *     2.代理类 A2
 *   代理类 A2 中使用 A1 对象 ,使用中增加功能
 *
 *   外层 调用 A2 即可 不用再调用 A1
 *
 *
 *
 */

public class TestStaticProxy {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.getRequest();
    }
}
