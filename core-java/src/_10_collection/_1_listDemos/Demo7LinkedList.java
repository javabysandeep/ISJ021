package _10_collection._1_listDemos;


public class Demo7LinkedList {
    public static void main(String[] args) {
        //10,20,30,40,50...
        class Node {
            Object val;
            Node next;
            Node previous;

            Node(Object val) {
                this.val = val;
            }
        }
        class LinkedList {
            Node head;
            Node tail;

            public void add(Object object) {
                if (head == null) {
                    head = new Node(object);
                    tail = head;
                }
                Node node = new Node(object);
                node.next = head;
                head.previous = node;
                head = node;
            }

            public void print() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.val + "-->");
                    temp = temp.next;
                }
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.print();

    }
}
