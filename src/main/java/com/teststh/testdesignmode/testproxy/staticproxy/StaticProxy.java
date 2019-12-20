package com.teststh.testdesignmode.testproxy.staticproxy;

import com.teststh.testdesignmode.testproxy.GetRequestImpl;
import com.teststh.testdesignmode.testproxy.IGetRequest;


/***
 *
 *  静态代理 - 例如：加日志
 *
 *  interface A
 *     1.实现类 A1
 *     2.代理类 A2
 *   代理类 A2 中使用 A1 对象 ,使用中增加功能
 *
 *   外层 调用 A2 即可 不用再调用 A1
 *
 *
 */
public class StaticProxy implements IGetRequest {

    private GetRequestImpl getRequest;

    @Override
    public void getRequest() {
        if(getRequest == null){
            getRequest = new GetRequestImpl();
        }
        getRequestBegin();
        getRequest.getRequest();
        getRequestEnd();
    }

    private void getRequestBegin(){
        System.out.println("get request begin");
    }

    private void getRequestEnd(){
        System.out.println("get request end");
    }
}
