package com.heima.Base.Day13;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1_Array {

    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("alex");
        array.add("fiona");
        array.add("simon");
        //
        Iterator it = array.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //集合转换为数组
        Object[] t = array.toArray();
        System.out.println(array.get(0));
        for (int i = 0; i < array.size(); i++) {
            System.out.println(t[i]);
        }



    }
}
