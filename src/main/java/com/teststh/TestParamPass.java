package com.teststh;

/**
 * 测试参数传递
 */
public class TestParamPass {
    /**
     * 数组  - 参数会变
     * 对象 - 参数会变
     * String - 参数不会变
     */
    public static void main(String[] args) {
        String s = "oldString";
        System.out.println("before : " + s);
        testString(s);
        System.out.println("after  : " + s);

        String[] stringArr = new String[] { "oldString1", "oldString2" };
        System.out.println("before : " + stringArr[0] + " " + stringArr[1]);
        testArray(stringArr);
        System.out.println("after  : " + stringArr[0] + " " + stringArr[1]);

        int[] intArr = new int[] { 0, 1 };
        System.out.println("before : " + intArr[0] + " " + intArr[1]);
        testIntArray(intArr);
        System.out.println("after  : " + intArr[0] + " " + intArr[1]);

        //        Student student = new Student();
        //        student.setName("oldStudent");
        //        student.setCode("oldCode");
        //        student.setAge(10);
        //        System.out.println(
        //            "before : " + student.getCode() + " " + student.getName() + " " + student.getAge());
        //        testObject(student);
        //        System.out.println(
        //            "after  : " + student.getCode() + " " + student.getName() + " " + student.getAge());
    }

    public static void testString(String s) {
        s = "newString";
    }

    public static void testArray(String[] s) {
        s[0] = "newString1";
        s[1] = "newString2";
    }

    public static void testIntArray(int[] array) {
        array[0] = 2;
        array[1] = 3;
    }

    //    public static void testObject(json.entity.Student student) {
    //        student.setName("newStudent");
    //        student.setCode("newCode");
    //        student.setAge(20);
    //    }
}
