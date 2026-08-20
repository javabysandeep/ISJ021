package _09_string_handling;

import java.util.HashMap;

public class Demo9OccurrenceOfChar {
    public static void main(String[] args) {
        String str = "rahul gandhi is coming to pune";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        /*
        r = 1
        a = 1 + 1
        h = 1 + 1
        u = 1 + 1
        l= 1
         = 1 + 1 + 1 + 1 + 1
        g = 1 + 1
        n = 1 + 1 + 1
        d = 1
        i = 1 + 1 + 1
        s = 1
        c = 1
        o = 1 + 1
        m = 1
        t = 1
        p = 1
        e = 1
        * */
    }
}
