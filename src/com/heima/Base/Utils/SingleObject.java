package com.heima.Base.Utils;

import java.awt.image.SampleModel;
import java.text.SimpleDateFormat;

public class SingleObject {

    /*private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }*/
    //单列模式的实现
    private volatile static SingleObject instance;

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        if (instance == null) {
            synchronized (SingleObject.class) {
                instance = new SingleObject();
            }
        }
        return instance;
    }

    public void getMessage(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YY-MM-DD");
        long currentTimeMillis = System.currentTimeMillis();
        String format = simpleDateFormat.format(currentTimeMillis);
        System.out.println(format);
    }
}
