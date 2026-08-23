package _10_collection._2_setDemos;

import java.util.HashSet;
import java.util.Set;

public class Demo1HashSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(null);
        set.add(null);
        set.add("abc");
        set.add("abc");
        set.add("xyz");
        System.out.println(set);

    }
}
