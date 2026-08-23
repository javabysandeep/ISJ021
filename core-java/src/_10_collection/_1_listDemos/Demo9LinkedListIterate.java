package _10_collection._1_listDemos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Demo9LinkedListIterate {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(3);
        list.add(40);
        list.add(50);

        System.out.println("01. Iterate one by one using index");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("************** 02. Iterate by using for loop *************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("************** 03. Iterate by using enhanced for loop *************");
        for (int temp : list) {
            System.out.println(temp);
        }

        System.out.println("************** 04. Iterate by using Iterator *************");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************** 05. Iterate by using java8 forEach method *************");
        Consumer<Integer> consumer = input -> System.out.println(input);
        list.forEach(consumer);

        System.out.println("************** 05. Iterate by using java8 forEach method *************");
        list.forEach(input -> System.out.println(input));


        System.out.println("************** 05. Iterate by using java8 forEach method *************");
        list.forEach(System.out::println);
    }
}
