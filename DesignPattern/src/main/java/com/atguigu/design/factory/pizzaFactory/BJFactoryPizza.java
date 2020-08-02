package com.atguigu.design.factory.pizzaFactory;

import com.atguigu.design.factory.abstact.Apizza;
import com.atguigu.design.factory.abstact.BJCheesPizza;
import com.atguigu.design.factory.abstact.BJGreekPizza;

public class BJFactoryPizza implements PizzaFactory {


    public Apizza CreatePizza(String orderType) {

        Apizza pizza = null;

        if ("greek".equals(orderType)){
            pizza = new BJGreekPizza();
            pizza.setName("北京奶酪披萨");
        } else if ("chees".equals(orderType)){
            pizza = new BJCheesPizza();
            pizza.setName("北京胡椒披萨");
        }

        return pizza;
    }
}
