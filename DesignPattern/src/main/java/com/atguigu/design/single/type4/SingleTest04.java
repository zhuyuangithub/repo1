package com.atguigu.design.single.type4;

public class SingleTest04 {

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

    //加入同步处理的，线程安全，但是效率不高。
    public static synchronized Single getInstance(){

        if (instance == null){
            instance = new Single();
        }
        return instance;

    }

}
