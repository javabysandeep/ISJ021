package _10_collection._4_mapDemos;

import java.util.HashMap;
import java.util.Map;

public class Demo5AddAll {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aditya", 22);
        map.put("samrat", 21);
        map.put("mayuresh", 18);
        map.put("shravani", 17);
        map.put("saloni", 16);

        Map map2 = new HashMap();
        map2.putAll(map);

        System.out.println(map2);

    }
}
