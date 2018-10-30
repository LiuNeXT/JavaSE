package com.heima.Base.Day13;

import java.util.ArrayList;
import java.util.List;

public class Demo1_Array {

    public static void main(String[] args) {
        List<String> array = new ArrayList<String>();
        array.add("alex");
        array.add("fiona");
        array.add("simon");

        Object[] t = array.toArray();
        System.out.println(array.get(0));
        for (int i = 0; i <array.size() ; i++) {
            System.out.println(t.length);

        }


    }
}
