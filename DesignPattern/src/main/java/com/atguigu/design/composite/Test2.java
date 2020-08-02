package com.atguigu.design.composite;

public class Test2 {
    public static void main(String[] args) {
        new TestForStatic().say();

    }
}

class TestForStatic{

    public static void say(){
        System.out.println("你好。");
    }
}