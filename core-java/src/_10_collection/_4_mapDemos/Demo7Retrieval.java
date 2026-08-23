package _10_collection._4_mapDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo7Retrieval {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aditya", 22);
        map.put("samrat", 21);
        map.put("mayuresh", 18);
        map.put("shravani", 17);
        map.put("saloni", 16);

        System.out.println("01. get a single entry value");
        System.out.println(map.get("aditya"));//22

        System.out.println("only keys : " + map.keySet());
        System.out.println("get only values " + map.values());

        System.out.println("get all entries " + map.entrySet());

    }
}
