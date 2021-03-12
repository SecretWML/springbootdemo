package com.proxy.dynamic;

public class TestLoggerProxy {
    public static void main(String[] args) {
        LoggerProxy loggerProxy = new LoggerProxy(new TestServiceImpl2());
        ITestService service = (ITestService)loggerProxy.createProxy();
        service.test1();
        service.test2();
    }
}
