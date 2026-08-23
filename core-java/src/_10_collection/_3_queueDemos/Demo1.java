package _10_collection._3_queueDemos;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add("abc");
        queue.add("xyz");
        queue.add(null);
        queue.add("tvs");

        System.out.println("deletion");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll()); //null
        System.out.println(queue.remove()); //NoSuchElementException
    }
}
