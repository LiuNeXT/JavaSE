package com.heima.Base.Utils;

import java.util.ArrayList;
import java.util.List;

public class TestStatic {
    public static final List<String> list = new ArrayList();

    static {
        list.add("Alex");
    }

    public static void main(String[] args) {
        System.out.println(list);
    }
}
