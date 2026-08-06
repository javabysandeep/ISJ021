package _05_oops.abstraction;

public class Demo2 {
    public static void main(String[] args) {
        interface I1 {
            //01. variables are by default public static final
            int variable1 = 100;
            public static final int variable2 = 200;

            //02. by default methods are public abstract
            void m1();

            public abstract void m2();

            //03. from java 8 onwards we can write static methods
            public static void staticMethod() {
                System.out.println("static method in interface");

            }


            //04. from java 8 onwards we can write default methods
            public default void defaultMethod() {
                System.out.println("default method in interface");

            }

            //05. by default nested classes are public static
            class Nested1 {
            }

            public static class Nested2 {
            }
        }

        interface I2 {
            //Instance members are not allowed
            //I2(){}
            //{}
            //static {}
        }
    }
}
