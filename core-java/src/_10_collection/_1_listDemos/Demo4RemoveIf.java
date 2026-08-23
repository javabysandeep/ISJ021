package _10_collection._1_listDemos;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo4RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);

        //remove even numbers
        System.out.println("Before removeIf " + integerArrayList);

        Predicate<Integer> filter = number -> number % 2 == 0;
        integerArrayList.removeIf(filter);

        System.out.println("After removeIf " + integerArrayList);

    }
}
