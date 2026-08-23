package _10_collection._2_setDemos;

import java.util.Set;
import java.util.TreeSet;

public class Demo5TreeSet {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(11);
        set.add(2);
        set.add(3);
        set.add(3);
       // set.add(null);
//        set.add(null);
       /* set.add("abc");
        set.add("abc");
        set.add("xyz");*/
        System.out.println(set);

    }
}
