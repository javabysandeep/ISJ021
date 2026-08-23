package _10_collection._3_queueDemos;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Demo3CustomObjectPriorityQueue {
    public static void main(String[] args) {
        class Employee implements Comparable<Employee> {
            @Override
            public int compareTo(Employee o) {
                return this.id - o.id;
            }

            int id;
            String name;
            double salary;

            public Employee(int id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            @Override
            public String toString() {
                return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
            }


        }
        Employee e1 = new Employee(10, "aditya", 10000);
        Employee e2 = new Employee(2, "mayuresh", 2900);
        Employee e3 = new Employee(3, "samrat", 522);
        Employee e4 = new Employee(41, "saloni", 25000);
        Employee e5 = new Employee(15, "shravani", 12500);
        Employee e6 = new Employee(15, "shravani", 12500);

        Queue<Employee> employees = new PriorityQueue<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());


    }
}
