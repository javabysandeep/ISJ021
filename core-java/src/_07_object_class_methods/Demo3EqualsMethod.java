package _07_object_class_methods;

public class Demo3EqualsMethod {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }


        }
        Student student1 = new Student(1, "abc");
        Student student2 = student1;
        Student student3 = student2;
        Student student4 = new Student(1, "abc");

        System.out.println("== operator does reference check for non primitives");
        System.out.println(student1 == student2);//true
        System.out.println(student1 == student3);//true
        System.out.println(student2 == student3);//true

        System.out.println("equals() method from Object class does reference check for non primitives");

        System.out.println(student1.equals(student2));//true
        System.out.println(student1.equals(student3));//true
        System.out.println(student2.equals(student3));//true

        System.out.println(student1 == student4); //false
        System.out.println(student1.equals(student4));//false

    }
}
