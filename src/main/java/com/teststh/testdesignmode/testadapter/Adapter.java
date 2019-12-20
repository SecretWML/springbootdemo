package com.teststh.testdesignmode.testadapter;

/***
 * 适配器类
 * */
public class Adapter implements Target{

    Adaptee adaptee = new  Adaptee();

    @Override
    public void request() {
        adaptee.getRequest();
    }
}
