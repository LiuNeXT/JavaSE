package com.heima.Base.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda {

    private  static  final  String PRODUCT = "PRODUCT_%s";

    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //利用stream().forEach()循环处理List;
        list.stream().forEach(i -> {
            System.out.println(i);
        });




        //利用stream().map()处理List，并给另外一个List赋值：
        List<Integer> collect = list.stream().map(Integer::intValue).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(String.format(PRODUCT, "123"));

    }
}
