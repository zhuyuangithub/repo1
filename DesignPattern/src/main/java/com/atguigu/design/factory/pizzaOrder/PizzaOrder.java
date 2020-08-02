package com.atguigu.design.factory.pizzaOrder;

import com.atguigu.design.factory.abstact.Apizza;
import com.atguigu.design.factory.pizzaFactory.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaOrder {

    private PizzaFactory pizzaFactory;

    public PizzaOrder(PizzaFactory pizzaFactory){

        this.pizzaFactory = pizzaFactory;

    }


    public void CreatePizzaForEach() throws IOException {
        Apizza apizza = null;
        do {
            String orderType = this.getType();
            apizza =  pizzaFactory.CreatePizza(orderType);
            if (apizza != null){
                apizza.prepare();
                apizza.cookie();
                apizza.cut();
                apizza.box();
            } else {
                System.out.println("你的披萨无法生产！");
                break;
            }
        }while (true);
    }



    private String getType() throws IOException {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("pizza种类:");

        String str = strin.readLine();

        return str;
    }
}
