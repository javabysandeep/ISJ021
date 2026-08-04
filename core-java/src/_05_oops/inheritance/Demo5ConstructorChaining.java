package _05_oops.inheritance;

public class Demo5ConstructorChaining {
    public static void main(String[] args) {
        class Parent {
            Parent() {
                System.out.println("Parent class :: constructor");
            }
        }
        class Child extends Parent {
            Child() {
                this(1);
                System.out.println("Child class :: constructor");
            }

            Child(int a) {
                super();
                System.out.println("Child class :: constructor");
            }
        }
        Child child = new Child();
    }
}
/*
            Parent class :: constructor
            Child class :: constructor
            Child class :: constructor
* */
