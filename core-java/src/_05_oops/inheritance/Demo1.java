package _05_oops.inheritance;

public class Demo1 {
    public static void main(String[] args) {
        class Parent {
            int a = 100;

            void m1() {
                System.out.println("Parent ::m1");
            }
        }
        class Child extends Parent {
            void m2() {
                System.out.println("Child ::m2");
            }
        }
        Child child = new Child();

        // 01. Parent parent = new Parent();
        Parent parent = new Parent();
        parent.m1();
        //parent.m2();//CTE

    }
}
