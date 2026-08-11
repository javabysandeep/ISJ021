package _07_object_class_methods;

public class Demo2HashCodeMethod {
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

        System.out.println(student1.hashCode()); //149928006
        System.out.println(student2.hashCode()); //149928006
        System.out.println(student3.hashCode()); //149928006

        student2.equals(student1);


    }
}
