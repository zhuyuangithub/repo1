package com.atguigu.design.factory;

import com.atguigu.design.factory.pizzaFactory.BJFactoryPizza;
import com.atguigu.design.factory.pizzaOrder.PizzaOrder;

import java.io.IOException;
import java.util.Scanner;

public class PizzaTest {

    public static void main(String[] args) throws IOException {

//        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("北京还是伦敦:");
//
//        String str = strin.readLine();
        System.out.println("北京还是伦敦:");
        Scanner scanner= new Scanner(System.in);
        String str = scanner.next();
        if ("beijing".equals(str)){
            new PizzaOrder(new BJFactoryPizza()).CreatePizzaForEach();
        } else if ("lundun".equals(str)){
            new PizzaOrder(new BJFactoryPizza()).CreatePizzaForEach();
        }
    }
}
