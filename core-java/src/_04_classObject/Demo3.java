package _04_classObject;

public class Demo3 {
    public static void main(String[] args) {

        class Student {
            int id; //Instance variable
            String name; // instance variable
            static String collegeName = "Pune University"; // static variable

            void display() {
                int temp = 10; //local variable
                System.out.println(temp);
            }


        }

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Student record "
                + s1.id + "\t" + s1.name + "\t" + Student.collegeName);
        System.out.println("Student record " +
                s2.id + "\t" + s2.name + "\t" + Student.collegeName);

    }
}
