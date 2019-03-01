package com.heima.Base.Utils;

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStatic {

    //需要new对象后，用静态里面写
    public static final List<String> list = new ArrayList();

    static {
        list.add("Alex");
    }

    public static void main(String[] args) {

        //System.out.println(list);
        //print();
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        for (String player : players) {
            System.out.println(player);
        }
        players.forEach((player) -> System.out.println(player));

        players.forEach(System.out::println);

        //Integer result = (int even, int odd) -> even + odd;

    }

    public static void print() {
        int count  = 1;
        if (count == 0){
            System.out.println("count="+count);
        }
        System.out.println("count不等于0");

    }



}
