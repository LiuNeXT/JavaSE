package com.heima.Base.Day27;

import com.heima.Base.Day06.Person;

import javax.lang.model.SourceVersion;
import javax.tools.Tool;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

public class Test3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Person alex = new Person("alex", 11);
        System.out.println(alex.toString());

        //com.heima.Base.Day27.Tool tool = new com.heima.Base.Day27.Tool(alex,"name","fiona");
        com.heima.Base.Day27.Tool tool = new com.heima.Base.Day27.Tool();
        tool.setProperty(alex,"name","fiona");
        System.out.println(alex.toString());
    }
}
