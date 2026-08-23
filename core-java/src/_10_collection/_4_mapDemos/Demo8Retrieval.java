package _10_collection._4_mapDemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo8Retrieval {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aditya", 22);
        map.put("samrat", 21);
        map.put("mayuresh", 18);
        map.put("shravani", 17);
        map.put("saloni", 16);

        System.out.println("iterating only keys");
        Set<String> keys = map.keySet();
        //traditional for loop : index is not there in Set

        //enhanced for loop
        System.out.println("enhanced for loop");
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
        //iterator
        System.out.println("iterator way");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
        // forEach
        keys.forEach(key -> System.out.println(key));

    }
}
