package com.heima.Base.Day13;

import java.util.ArrayList;
import java.util.Iterator;
//
public class Demo2_Array {
    public static void main(String[] args) {
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
        String[] color =  {"红桃","黑桃","方块","梅花"};
        ArrayList<String> poker = new ArrayList<>();

        //拼接颜色以及数字
        for ( String s1:num) {
            for (String s2:color) {
                poker.add(s2.concat(s1));

            }
        }
        //System.out.println(poker);
        Object[] objects = poker.toArray();
        System.out.println(poker);
        for (int i = 0; i < objects.length; i++) {
            String s = String.valueOf(objects[i]);
            System.out.println(s);


        Iterator<String> it = poker.iterator();
        while (it.hasNext()){
            //System.out.println(it.next());
        }

        }
    }
}
