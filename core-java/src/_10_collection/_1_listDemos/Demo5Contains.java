package _10_collection._1_listDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo5Contains {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);

        System.out.println("contains " + integerArrayList.contains(11));

        List<Integer> searchList = new ArrayList();
        searchList.add(1);
        searchList.add(2);
        System.out.println("containsAll " + integerArrayList.containsAll(searchList));

    }
}
