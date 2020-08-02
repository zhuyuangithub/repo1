package com.atguigu.design.single.type5;

public class SingleTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
    }
}

class Singleton{

    private Singleton(){

    }

    //volatile修饰的变量会在第一次赋值之后强制将对缓存的修改操作立即写入主存

    /**
     * 变量的修改  先从主存中将变量读入CPU高速缓存中，之后CPU对变量进行写操作，写完之后再放到高速缓存中，之后高速缓存再去刷新主存中变量的值,
     * 这个过程是有一个时间差的过程，因此为了尽可能（目前赋值操作是原子性）保证值的原子性，并且肯定的保证可见性和有序性，尤其是可见性，用volatile进行修饰；
     *
     */

    private static volatile Singleton instance;


    public static Singleton getInstance(){

        /**
         *
         *  第一次判断为null，多个线程进去之后，锁住资源，之后第一个线程赋值之后立马写入主存，之后其他线程的高速缓存中的缓存变量缓存行失效；
         *  因此所有线程必须重新去主存中读取instance值，此时的instance值已经有值了，不会再次进行对象创建，这样就会保证只会创建一个对象；
         *
         */

        if(instance == null){
            //锁住资源
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
