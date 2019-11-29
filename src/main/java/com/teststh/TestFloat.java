package com.teststh;


import java.util.HashMap;
import java.util.Map;

public class TestFloat {
    public static void main(String[] args) {
        float f= -5;
        System.out.println(Math.abs(f));
        int i = -1;
        System.out.println(Math.negateExact(i));
        Map<String,String> map = new HashMap<>();
        String value1 = map.put("key1","key1");
        String value2 = map.put("key1","key2");
        System.out.println(value1 + " -- " + value2);
    }

}
