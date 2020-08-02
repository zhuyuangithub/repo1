package com.atguigu.datastruct;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapList {

    public static void main(String[] args) {
        
        Map<String,Object> map = new HashMap<>();

        map.put("1", 10);
        map.put("2", 20);
        map.put("3", 30);
        map.put("4", 40);

//        for (Map.Entry<String, Object> entry : map.entrySet()) {
//            String key = entry.getKey();
//        }


        map.forEach((k, v) -> {
            System.out.println(k);
            if (k.equals("3")){
                System.out.println(v);
            }
        });
    }
    
}
