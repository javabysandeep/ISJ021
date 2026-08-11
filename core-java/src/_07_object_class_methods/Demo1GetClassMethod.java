package _07_object_class_methods;

import java.lang.reflect.Field;

public class Demo1GetClassMethod {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public Student() {
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }
        Student student = new Student();
        Class<? extends Student> ref = student.getClass();
        System.out.println("****** metadata about student object ************");
        System.out.println("complete name along with package = " +
                "" + ref.getName());
        //complete name along with package = _07_object_class_methods.Demo1$1Student
        Field[] declaredFields = ref.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }
    }
}
