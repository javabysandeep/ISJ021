package _07_object_class_methods;

public class Demo5FinalizeMethod {
    public static void main(String[] args) {
        class Student {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize method");
            }
        }
        Student s1 = new Student();
        s1 = new Student();
        System.gc();
    }
}
