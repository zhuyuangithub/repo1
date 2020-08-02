package com.atguigu.design.factory.pizzaFactory;

import com.atguigu.design.factory.abstact.Apizza;

public interface PizzaFactory {

    Apizza CreatePizza(String orderType);

}
