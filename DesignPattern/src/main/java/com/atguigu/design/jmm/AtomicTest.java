package com.atguigu.design.jmm;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    private static AtomicInteger i =  new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i1 = 0; i1< 50000; i1++) {
                i.getAndIncrement();
            }
        });


        Thread t2 = new Thread(() -> {
            for (int i1 = 0; i1< 50000; i1++) {
                i.getAndDecrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(i);

    }
}
