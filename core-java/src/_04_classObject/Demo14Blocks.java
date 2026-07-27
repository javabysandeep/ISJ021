package _04_classObject;

public class Demo14Blocks {
    public static void main(String[] args) {
        class Student {
            {
                System.out.println("instance block");
            }

            static {
                System.out.println("static block");
            }
        }
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        /*output
        *
            static block
            instance block
            instance block
            instance block
            instance block

        *
        * */
    }
}
