package _07_object_class_methods;

public class Demo10JavaMethodStack {
    public static void main(String[] args) {
        Student student = new Student(1, "Aditya");
        display(student);
        System.out.println("main method \n" + student);
    }

    private static void display(Student student) {
        student.id = 101;
        student.name = "Samrat";
        System.out.println("display method \n" + student);
    }

    static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
/*
        display method
        Student{id=101, name='Samrat'}

        main method
        Student{id=101, name='Samrat'}
  */

