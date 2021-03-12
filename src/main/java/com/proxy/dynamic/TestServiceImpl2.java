package com.proxy.dynamic;

public class TestServiceImpl2 implements ITestService{
    @Override
    public String test1() {
        System.out.println("TestServiceImpl2.test1");
        return"";
    }

    @Override
    public String test2() {
        System.out.println("TestServiceImpl2.test2");
        return"";
    }
}
