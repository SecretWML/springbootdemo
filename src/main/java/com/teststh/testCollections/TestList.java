package com.teststh.testCollections;

import com.teststh.param.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(01, "zhanglulu", 25));
        users.add(new User(02, "wzp", 26));
        users.add(new User(03, "wzg", 11));
        System.out.println("排序前：");
        for (User user : users) {
            System.out.println(user.toString());
        }

        //User必须实现Comparable接口  重写compare方法
        Collections.sort(users);

        //自定义根据什么排序 等于Collections.sort
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                try {
                    return o1.getAge() - o2.getAge();
                } catch (Exception e) {
                    return 0;
                }
            }
        });

        System.out.println("排序后：");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

}
