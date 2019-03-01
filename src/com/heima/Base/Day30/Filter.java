package com.heima.Base.Day30;

import java.util.HashMap;
import java.util.Map;


public class Filter {


    private static Map<Integer, Object> map = new HashMap<>();

    static {
        map.put(1, "C");
        map.put(2, "Java");
        map.put(3, "C++");
        map.put(4, "Python");
        map.put(5, "Swift");
    }

    public static void main(String[] args) {
        getMap1();
//        getMap2();
//        getMap3();
//        getMap4();
    }

    public  static  void  getMap1(){

        System.out.println(map.get(1));
        System.out.println(map.toString());
    }

    public  static  void  getMap2(){

        System.out.println(map.get(2));
    }

    public  static  void  getMap3(){

        System.out.println(map.get(4));
    }

    public  static  void  getMap4(){

        System.out.println(map.get(5));
    }





}
