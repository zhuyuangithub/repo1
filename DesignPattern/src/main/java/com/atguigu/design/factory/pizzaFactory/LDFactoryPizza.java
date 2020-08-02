package com.atguigu.design.factory.pizzaFactory;

import com.atguigu.design.factory.abstact.*;

public class LDFactoryPizza implements PizzaFactory {


    public Apizza CreatePizza(String orderType) {

        Apizza pizza = null;

        if ("greek".equals(orderType)){
            pizza = new LDGreekPizza();
            pizza.setName("伦敦奶酪披萨");
        } else if ("chees".equals(orderType)){
            pizza = new LDCheesPizza();
            pizza.setName("伦敦胡椒披萨");
        }

        return pizza;
    }


}
