package _10_collection._2_setDemos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo7TreeSetCustomObjectsComparator {
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
                return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
            }


        }
        Employee e1 = new Employee(10, "aditya", 10000);
        Employee e2 = new Employee(2, "mayuresh", 2900);
        Employee e3 = new Employee(3, "samrat", 522);
        Employee e4 = new Employee(41, "saloni", 25000);
        Employee e5 = new Employee(15, "shravani", 12500);
        Employee e6 = new Employee(15, "shravani", 12500);

        Comparator<Employee> idCComparator = (emp1, emp2) -> emp1.id - emp2.id;
        Comparator<Employee> nameCComparator = (emp1, emp2) -> emp1.name.compareTo(emp2.name);

        Set<Employee> employees = new TreeSet<>(nameCComparator);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        employees.forEach(System.out::println);


    }
}
