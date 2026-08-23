package _10_collection._4_mapDemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2LinkedHashMap {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put(null, null);
        map.put(null, "abc");
        map.put(1, "def");
        map.put(2, "abc");
        map.put(3, null);
        map.put("abc", null);
        map.put("abc", 123);
        System.out.println(map);
    }
}
