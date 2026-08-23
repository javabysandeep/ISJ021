package _10_collection._1_listDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo13SortingStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("d");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("e");

        System.out.println("Before sorting");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("After sorting");
        System.out.println(list);
    }
}
