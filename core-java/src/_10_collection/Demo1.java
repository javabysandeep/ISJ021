package _10_collection;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //10, 20, 30
        //01. variables
        //02. array
        //03. Collection [AL, LL, V, S, HS, LHS, TS, PQ]
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add(10);
        list.add("c");
        list.add(20);
        list.add(20);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.toString());

        ArrayList list2 = new ArrayList();
        list2.addAll(list);
        System.out.println(list2.toString());

        list2.addFirst("added at the beginning");
        System.out.println(list2.toString());

    }
}
