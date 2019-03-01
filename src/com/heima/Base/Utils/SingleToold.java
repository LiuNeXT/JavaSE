package com.heima.Base.Utils;

import com.heima.Base.Day11.bean.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SingleToold {

    public static void main(String[] args) {
        //SingleObject instance = SingleObject.getInstance();
        //instance.getMessage();

        try {
            Class clazz = Class.forName("com.heima.Base.Day11.bean.Person");
             Method method =clazz.getMethod("print");
             method.invoke(null,null);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
