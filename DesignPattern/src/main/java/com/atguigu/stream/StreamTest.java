package com.atguigu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add(8);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(6);
        list.add(1);
        list.add(8);


        Stream<Object> stream = list.stream();



        List<Object> list2 = new ArrayList<>();
//        stream.distinct().forEach((x) -> list2.add(x));

        List<Object> collect = stream.distinct().collect(Collectors.toList());
        System.out.println(collect);

    }
}
