package _10_collection._1_listDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo14CustomObjectSorting {
    public static void main(String[] args) {
        class Employee implements Comparable<Employee> {
            @Override
            public int compareTo(Employee o) {
                //return this.id - o.id; //ascedning
                return (int) (this.salary - o.salary); //ascending
                //  return o.id - this.id; //descending
                //return this.name.compareTo(o.name); //ascedning
               // return o.name.compareTo(this.name); //descending
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
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        '}';
            }
        }
        Employee e1 = new Employee(10, "aditya", 10000);
        Employee e2 = new Employee(2, "mayuresh", 2900);
        Employee e3 = new Employee(3, "samrat", 522);
        Employee e4 = new Employee(41, "saloni", 25000);
        Employee e5 = new Employee(15, "shravani", 12500);

        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("************* before sorting ************** ");
        list.forEach(System.out::println);

        Collections.sort(list);

        System.out.println("************* after sorting ************** ");
        list.forEach(System.out::println);


    }
}
