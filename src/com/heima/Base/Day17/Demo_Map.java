package com.heima.Base.Day17;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Base
 * @description:
 * @author: Alex
 * @create: 2018-10-23 21:38
 **/
public class Demo_Map {

    public static void main(String[] args) {
        // new1个新的对象
        Map<String, Integer> map = new HashMap<>();
        //往里面放入数据
        map.put("Alex",10);
        map.put("Fiona",11);
        map.put("Simon",12);
        map.put("Jack",13);
        map.put("Tom",14);
        //取出
        System.out.println(map.get("Alex"));
        System.out.println(map.get(12));
    }
}
