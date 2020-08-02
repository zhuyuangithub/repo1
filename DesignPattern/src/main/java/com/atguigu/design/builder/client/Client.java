package com.atguigu.design.builder.client;

import com.atguigu.design.builder.builders.CommonBuilder;
import com.atguigu.design.builder.builders.HighBuilder;
import com.atguigu.design.builder.director.Director;

public class Client {
    public static void main(String[] args) {

        HighBuilder highBuilder = new HighBuilder();

        Director director = new Director(highBuilder);

        System.out.println(director.commandHouse());




        CommonBuilder commonBuilder = new CommonBuilder();

        Director director1 = new Director(commonBuilder);

        System.out.println(director1.commandHouse());
    }
}
