package com.heima.Base.Day32;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.IntStream;

public class KeyUtils {


    public static void main(String[] args) {
        getKey();
    }


    public static  synchronized String getKey(){

        Random random =  new Random();
        int i = random.nextInt(1000000);
        System.out.println(i);
        String result = System.currentTimeMillis()+String.valueOf(i);
        System.out.println(result);
        for (int j = 0; j < 100; j++) {
            System.out.println(j);

        }
        return result;
    }


    public String convertObj(Object object){
        String s = "3";
        int i = Integer.parseInt(new String("3"));
        return null;

    }

}
