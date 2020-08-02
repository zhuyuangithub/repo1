package com.atguigu.design.single.type6;

public class SingleTest06 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());

    }

}


class Singleton{

    private Singleton(){ }


    /**
     * 静态内部类在类的加载过程中不会被加载，则可以在调用它的静态方法的同时加载静态内部类，则会生成对象；
     *
     * 主要是类在加载的时候是线程安全的。
     */
    static class SingletonContainer{

        private static final Singleton INSTANCE  = new Singleton();

    }

    public static Singleton getInstance(){
        return  SingletonContainer.INSTANCE;
    }

}


