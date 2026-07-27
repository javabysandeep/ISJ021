package _04_classObject.constructors;

public class Demo1 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;
        }
        Student s1 = new Student();//call to default constructor
        Student s2 = new Student();//call to default constructor

        //s1 ---> {id = 0, name="null"}
        //s2 ---> {id = 0, name="null"}
        System.out.println("s1 = {" + s1.id + "," + s1.name + "}");
        System.out.println("s2 = {" + s2.id + "," + s2.name + "}");

    }
}
