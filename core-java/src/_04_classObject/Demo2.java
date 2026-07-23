package _04_classObject;

public class Demo2 {
    class A{}
    static class B{}
    public static void main(String[] args) {

        class Student {
            int id;
            String name;
        }
        Student s1 = new Student(); // 0. null

        System.out.println("student roll number = " + s1.id); //0
        System.out.println("student name = " + s1.name); //null

        s1.id = 101;
        s1.name = "Krishna";

        System.out.println("student roll number = " + s1.id);
        System.out.println("student name = " + s1.name);

    }
}
