package _04_classObject.constructors;

public class Demo3 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            Student(int id, String name) {
                System.out.println(" parameterized constructor");
                //assigning local to local
                id = id;
                name = name;

                //assigning local to instance
                this.id = id;
                this.name = name;
            }
        }
        Student s1 = new Student(1, "Pushkar");//call to  parameterized constructor
        Student s2 = new Student(2, "Ayan");//call to  parameterized constructor

        //s1 ---> {id = 1, name="Pushkar"}
        //s2 ---> {id = 2, name="Ayan"}
        System.out.println("s1 = {" + s1.id + "," + s1.name + "}");
        System.out.println("s2 = {" + s2.id + "," + s2.name + "}");

    }
}
