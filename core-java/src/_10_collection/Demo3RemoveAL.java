package _10_collection;

import java.util.ArrayList;
import java.util.List;

public class Demo3RemoveAL {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        List removeList = new ArrayList();
        removeList.add(5);
        removeList.add(6);

        list1.removeAll(removeList);
        System.out.println(list1); //1, 3, 4
        list1.clear();
        System.out.println(list1);
    }
}
