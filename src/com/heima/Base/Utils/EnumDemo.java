package com.heima.Base.Utils;

public enum EnumDemo{

    RED("红色", 1), GREEN("绿色", 2), BLANK("黑色", 3), YELLO("黄色", 4),WHITE("白色",5);

    private String color;

    private Integer code;

    EnumDemo(String color, Integer code) {
        this.color = color;
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public Integer getCode() {
        return code;
    }

    public static void main(String[] args) {
        System.out.println(EnumDemo.WHITE.getCode());
    }
}
