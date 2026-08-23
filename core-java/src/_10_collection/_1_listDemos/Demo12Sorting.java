package _10_collection._1_listDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo12Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(32);
        list.add(4);
        list.add(5);
        System.out.println("************* before sorting ************** ");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("************* after sorting ************** ");
        System.out.println(list);

    }
}
