package _04_classObject;

public class Demo9 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;
            int age;

            public void setId(int input) {
                //we are assigning local variable value to instance variable
                id = input;
                // this is a reference variable which refers to the current class object
                this.id = input;

            }

            public void setName(String input) {
                this.name = input;
            }

            public void setAge(int age) {
                //assigning local variable to local variable
                age = age;

                //assigning local variable to instance variable
                this.age = age;
            }

            public static void show() {
                System.out.println("student static show method");
            }
        }
        Student.show();

        Student student = new Student();
        student.setId(1);
    }

}
