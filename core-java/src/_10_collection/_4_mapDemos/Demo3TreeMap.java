package _10_collection._4_mapDemos;

import java.util.Map;
import java.util.TreeMap;

public class Demo3TreeMap {
    public static void main(String[] args) {
        Map map = new TreeMap();
//        map.put(null, null);
//        map.put(null, "abc");
        map.put(11, "def");
        map.put(2, "abc");
        map.put(3, null);
//        map.put("abc", null);
//        map.put("abc", 123);
        System.out.println(map);
    }
}
