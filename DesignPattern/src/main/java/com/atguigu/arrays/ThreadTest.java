package com.atguigu.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.math.BigDecimal.*;

public class ThreadTest {

    public static void main(String[] args) {

//        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 60, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<Runnable>(5), Executors.defaultThreadFactory());

         Integer int1 = new Integer(1);
         Integer int2 = new Integer(2);

        System.out.println(int1 < int2);


        double a = 2.0616161616116;
        double b = 1.12212021503230;

        BigDecimal a1 = new BigDecimal(Double.toString(a));
        BigDecimal b1 = new BigDecimal(Double.toString(b));
        System.out.println(a - b);
        System.out.println(a1.subtract(b1).setScale(2, RoundingMode.HALF_UP));

    }
}
