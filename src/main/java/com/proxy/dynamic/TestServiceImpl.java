package com.proxy.dynamic;

public class TestServiceImpl implements ITestService{
    @Override
    public String test1() {
        System.out.println("TestServiceImpl.test1");
        return"";
    }

    @Override
    public String test2() {
        System.out.println("TestServiceImpl.test2");
        return"";
    }
}
