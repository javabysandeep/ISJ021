package _04_classObject.nestedClasses;

public class Demo3 {
    public static void main(String[] args) {

        class Student {
            void display() {
                System.out.println("display");
            }
        }
        Student s1 = new Student();
        s1.display();
    }
}

















