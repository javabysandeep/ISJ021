package _10_collection._1_listDemos;

import java.util.Vector;

public class Demo2Vector {
    public static void main(String[] args) {
        //10, 20, 30
        //01. variables
        //02. array
        //03. Collection [AL, LL, V, S, HS, LHS, TS, PQ]
        Vector list = new Vector();
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
    }
}
