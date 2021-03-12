package com.teststh.testobjectmapper;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.teststh.param.User;

import java.util.ArrayList;
import java.util.List;

public class TestObjectMapper {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> list = new ArrayList<>();
        list.add("sing");
        list.add("play");
        list.add("sleep");
        User user = new User(1,"100718","zhanglulu","zhanglulu@hd123.com",list);

        //序列化的时候序列对象的所有属性
        objectMapper.setSerializationInclusion(Include.ALWAYS);
        //如果是空对象的时候,不抛异常,也就是对应的属性没有get方法
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        try{
            //序列化 对象转成String
           String jsonStr = objectMapper.writeValueAsString(user);
           System.out.println("序列化："+jsonStr+"\n");

           //反序列化 String转对象
           User user1= objectMapper.readValue(jsonStr,User.class);
           System.out.println("反序列化user1：\n"+user1.toString());

            //反序列化的时候如果多了其他属性,不抛出异常
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
           String jsonStrWithNoParam = "{\"id\":1,\"loginId\":\"100718\",\"userName\":\"zhanglulu\",\"email\":\"zhanglulu@hd123.com\",\"age\":\"28\"}";
           User user2 = objectMapper.readValue(jsonStrWithNoParam,User.class);
           System.out.println("反序列化user2：\n"+user2.toString());


           //序列化List
            String listJsonStr = objectMapper.writeValueAsString(list);
            System.out.println("序列化list:"+ listJsonStr);
           //反序列化 List
            //方法一
            //List<String> returnList = objectMapper.readValue(listJsonStr, new TypeReference<List<String>>() {});
            //方法二
            JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, String.class);
            List<String> returnList = objectMapper.readValue(listJsonStr,javaType);
            System.out.println("反序列化list:"+returnList.toString());

            //序列化JsonArray
            String[] arr = new String[]{"1","2"};
//            arr.put("1");
//            arr.put("2");
           String str =  objectMapper.writeValueAsString(arr);
            System.out.println("序列化JsonArray:"+ str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

