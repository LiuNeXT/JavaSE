package com.heima.Base.Utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityUtils {


    public static void main(String[] args) {
        String vor1 = vor("1234");
        System.out.println(vor1);
        String vor2 = vor(vor1);
        System.out.println(vor2);

        String s = "hello";
        byte[] bytes = s.getBytes();
        System.out.println(new String(bytes));
        System.out.println(s.getBytes());
    }

    //使用异或加解密方法
    public  static  String vor(String password){
        //将String类型转化为char数组来实现对字符的异或
        char[] charPassWord = password.toCharArray();

        for (int i = 0; i < charPassWord.length; i++) {
            charPassWord[i] = (char) (charPassWord[i]^1024);

        }
        return new String(charPassWord);
    }

    public static String base64Encode(byte[] data){
        Class<?> clazz = null;
        String result = null;
        try {
            clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
            Method method = clazz.getMethod("encode", byte[].class);
            Object invoke = method.invoke(null, data);
            result = String.valueOf(invoke);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
