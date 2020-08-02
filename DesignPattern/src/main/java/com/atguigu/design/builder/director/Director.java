package com.atguigu.design.builder.director;

import com.atguigu.design.builder.builders.HouseBuilder;
import com.atguigu.design.builder.pojo.House;

public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House commandHouse(){

        houseBuilder.makeFoundation();
        houseBuilder.makeWall();
        houseBuilder.makeRoof();

        House house = houseBuilder.build();

        return house;
    }


}
