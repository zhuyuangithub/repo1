package com.atguigu.design.jmm;

public class TestJMM {


    private static  boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {

            while (flag){

            }

        });

        thread.start();



        thread.sleep(1000);

        flag = false;




    }
}
