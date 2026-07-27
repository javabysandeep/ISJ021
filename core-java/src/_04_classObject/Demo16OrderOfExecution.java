package _04_classObject;

public class Demo16OrderOfExecution {
    public static void main(String[] args) {
        class A {
            {
                System.out.println("A::instance block");
            }

            static {
                System.out.println("A::static block");
            }

            A() {
                super();
                System.out.println("A::constructor");
            }
        }
        A a = new A();
    }
}
/*
    A::static block
    A::instance block
    A::constructor
* */
