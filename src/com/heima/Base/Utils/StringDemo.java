package com.heima.Base.Utils;

import com.sun.deploy.uitoolkit.ui.LoggerConsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringDemo {

    private static String name;

    private static Map<Integer, Object> hashMap = new HashMap<>();

    public static void main(String[] args) {
        name = "alex";
//        byte[] bytes = name.getBytes();
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
//        }
        char[] chars = name.toCharArray();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            hashMap.put(i,String.valueOf(chars[i]));
            System.out.println(chars[i]);
            stringList.add(String.valueOf(chars[i]));
        }
        System.out.println(stringList);

    }



}
