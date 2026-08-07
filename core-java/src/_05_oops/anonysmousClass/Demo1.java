package _05_oops.anonysmousClass;

public class Demo1 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m1();
        }

        class B extends A {
            @Override
            void m1() {
                System.out.println("B::m1");
            }
        }

        A a = new B();
        a.m1();

        //This is not object creation of A class
        // This is class definition of anonymous class  and its object creation
        A ref = new A()/*this is object of anonymous class */ {
            //this is class body of anonymous class
            @Override
            void m1() {
                System.out.println("anonymous class ::m1");
            }
        };


    }
}
