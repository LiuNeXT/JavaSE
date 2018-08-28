package com.heima.Base.Day04;

public class Test1_For {
    public static void main(String[] args) {
        int he = 0;
        for (int i = 1;i <= 10; i++){
            if ( i % 2 == 0){
                he = he + i;
            }
        }
        System.out.println(he);
    }
}
