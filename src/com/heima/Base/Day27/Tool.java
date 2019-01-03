package com.heima.Base.Day27;

import com.heima.Base.Day06.Person;

import java.lang.reflect.Field;

public class Tool {


    //此方法可将obj对象中名为propertyName的属性的值设置为value。
    public void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = obj.getClass();  //获取字节码对象
        Field declaredField = aClass.getDeclaredField(propertyName); //暴力反射获取字段
        declaredField.setAccessible(true);   //去除权限
        declaredField.set(obj,value);
    }
}
