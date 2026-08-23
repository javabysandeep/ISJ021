package _10_collection._1_listDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo15CustomObjectSortingComparator {
    public static void main(String[] args) {
        class Employee {
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

        Comparator<Employee> comparatorId = (emp1, emp2) -> emp1.id - emp2.id;
        Comparator<Employee> comparatorName = (emp1, emp2) -> emp1.name.compareTo(emp2.name);
        Comparator<Employee> comparatorSalary = (emp1, emp2) -> (int) emp1.salary - (int) emp2.salary;

        System.out.println("************* before sorting ************** ");
        list.forEach(System.out::println);

        Collections.sort(list, comparatorSalary);

        System.out.println("************* after sorting ************** ");
        list.forEach(System.out::println);


    }
}
