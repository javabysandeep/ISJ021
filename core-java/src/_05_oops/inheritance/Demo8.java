package _05_oops.inheritance;

public class Demo8 {
    public static void main(String[] args) {
        class Parent {
            final void m1() {
                System.out.println("Parent::m1");
            }
        }
        class Child extends Parent {
           /* void m1() {
                System.out.println("Child::m1");
            }*/
        }
    }
}
