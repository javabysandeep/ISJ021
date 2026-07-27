package _04_classObject.constructors;

public class Demo5 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            //zero parameterized constructor
            Student() {
               // super();// this is added by default
                //this(1, "abc");
                this(1);
                System.out.println("zero param constructor");
            }

            //parameterized constructor
            Student(int id, String name) {
                //this(); // call to the zero param constructor
                //assigning local to instance
                this.id = id;
                this.name = name;
                System.out.println("param constructor");
            }
            Student(int id) {
                this.id = id;
                System.out.println("one param constructor");
            }
        }
        //Student s1 = new Student(1, "Pushkar");
        Student s1 = new Student();


    }
}
