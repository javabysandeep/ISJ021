package _05_oops.inheritance;

public class Demo4OrderOfExecution {
    public static void main(String[] args) {
        class Parent {
            static {
                System.out.println("Parent::static block");
            }

            {
                System.out.println("Parent::instance block");
            }

            Parent() {
                System.out.println("Parent::constructor");
            }
        }
        class Child extends Parent {
            static {
                System.out.println("Child::static block");
            }

            {
                System.out.println("Child::instance block");
            }

            Child() {
                System.out.println("Child::constructor");
            }
        }

        //Parent p = new Parent();//SB, IB, con

        Child child = new Child();//SBP, SBC, IBP, CP, IBC, CC
        /*
            Parent::static block
            Child::static block
            Parent::instance block
            Parent::constructor
            Child::instance block
            Child::constructor
        * */
    }
}
