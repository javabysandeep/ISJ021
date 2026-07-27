package _04_classObject.constructors;

public class Demo4 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            //zero parameterized constructor
            Student(){

            }
            //parameterized constructor
            Student(int id, String name) {
                this(); // call to the zero param constructor
                //assigning local to instance
                this.id = id;
                this.name = name;
            }
            //copy constructor
            Student(Student student){
                this.id = student.id;
                this.name = student.name;
            }
        }
        Student s1 = new Student(1, "Pushkar");//call to  parameterized constructor
        Student s2 = new Student(s1);

        //s1 ---> {id = 1, name="Pushkar"}
        //s2 ---> {id = 1, name="Pushkar"}
        System.out.println("s1 = {" + s1.id + "," + s1.name + "}");
        System.out.println("s2 = {" + s2.id + "," + s2.name + "}");

    }
}
