package com.atguigu.pojo;

public class Animal {

    private int i = 1;
    public void say(){
        System.out.println("喵喵喵....");
    }

    public int getI(){
        System.out.println("我返回了i的值..." + i);
        return i;
    }
}
