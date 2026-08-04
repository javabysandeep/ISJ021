package _05_oops.inheritance;

public class Demo2 {
    public static void main(String[] args) {
        class Parent {
            int a = 100;

            void m1() {
                System.out.println("Parent ::m1");
            }

            void m3() {
                System.out.println("Parent ::m3");
            }
        }
        class Child extends Parent {
            void m2() {
                System.out.println("Child ::m2");
            }

            void m3() {
                System.out.println("Child ::m3");
            }
        }
        //02. Child child = new Child();
        Child child = new Child();
        child.m1(); // present in only Parent class
        child.m2(); // present in only Child class
        child.m3(); // present in both parent and Child class


    }
}
