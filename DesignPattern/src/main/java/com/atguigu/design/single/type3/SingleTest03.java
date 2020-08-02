package com.atguigu.design.single.type3;

public class SingleTest03 {

    public static void main(String[] args) {
        Single instance = Single.getInstance();
        Single instance2 = Single.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
    }

}

//懒汉式
class Single{

    private static Single instance;

    private Single(){

    }

    public static Single getInstance(){
        //多个线程进入此处，会导致线程安全问题
        if (instance == null){
            instance = new Single();
        }
        return instance;

    }

}