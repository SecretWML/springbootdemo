package com.teststh.testlamda;

public class TestLamda {
    public static void main(String[] args) {
        //lamda表达式带参数
        //(参数)->单行语句
       // fun((s)->System.out.println(s));

        //lamda表达式带参数代码块
        //(参数)->{多行语句}
//        fun((s)->{
//            s = s.toUpperCase();//大写
//            System.out.println(s);//打印
//        });

        //lamda表达式
        // (参数)->表达式
        fun((s1,s2)-> s1+s2);

    }
    public static void fun(IMessage ims) {
//        ims.print("Hello World!");
//        ims.print("aaa!");
        System.out.println(ims.add(10, 20)+" , "+ims.add(20, 20));
 }
}

