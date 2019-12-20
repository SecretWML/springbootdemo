package com.teststh.testdesignmode.testproxy.dynamicproxy;

import com.teststh.testdesignmode.testproxy.GetRequestImpl;
import com.teststh.testdesignmode.testproxy.IGetRequest;

public class TestDynamicProxy {
    public static void main(String[] args) {
        IGetRequest getRequestProxy = new DynamicProxy(new GetRequestImpl()).getProxy();
        getRequestProxy.getRequest();
    }
}
