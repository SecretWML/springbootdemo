package com.teststh;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestFloat {
//    public static void main(String[] args) {
//        float f= -5;
//        System.out.println(Math.abs(f));
//        int i = -1;
//        System.out.println(Math.negateExact(i));
//        Map<String,String> map = new HashMap<>();
//        String value1 = map.put("key1","key1");
//        String value2 = map.put("key1","key2");
//        System.out.println(value1 + " -- " + value2);
//
//        //Test branch
//    }

//    public static void main(String[] args) throws Exception {
//        // new TestAllinPay().run();
//        String defaultVersion = "1.2-SNAPSHOT";
//        String str = "2.2";
//        System.out.println(str.compareToIgnoreCase(defaultVersion));
//    }

//    public static void main(String[] args) {
//        String delayDays = "400";
////        Date expireDate = StringUtil.addDate(StringUtil.truncateToDate(new Date()), Calendar.DAY_OF_MONTH,
////            Converter.toInt(delayDays)+1);
//
//        Date expireDate = StringUtil.addDate(new Date(), Calendar.DAY_OF_MONTH,
//                      Converter.toInt(delayDays)+1);
//
//        System.out.println(Converter.toString(expireDate));
//        System.out.println(expireDate.getTime());
//        System.out.println(Converter.toString(expireDate.getTime()));
//        System.out.println(Converter.toTimestamp(expireDate));
//    }

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("aa");
//        list.add("bb");
//        list.add("cc");
//        if(!list.contains("aa")){
//            list.add("aa");
//        }
//
//
//        System.out.println(list.size());
//
//        for(String s:list){
//            try{
//                if("bb".equals(s)){
//                    throw new Exception(s);
//                }
//            System.out.println(s+"-");}catch (Exception e){
//                System.out.println("error:"+e.getMessage()+"\n");
//            }
//        }

//        List<String> list = new ArrayList<>();
//               list.add("aa");
//               list.add("bb");
//                list.add("cc");
//                for(String s:list){
//                    try{
//                        if("bb".equals(s)){
//                                               throw new Exception(s);
//                                            }
//                    }catch (Exception e){
//                        System.out.println("error");
//                    }
//                    System.out.println(s+"\n");
//                }
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("1","4");
        System.out.println(map.get("1"));
    }

}
