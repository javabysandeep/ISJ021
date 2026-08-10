package _06_java8_features;

public class Demo8DefaultMethods {
    public static void main(String[] args) {

        interface I1 {
            default void m1() {
                System.out.println("m1() method in interface I1");
            }
        }
        interface I2 {
            default void m1() {
                System.out.println("m1() method in interface I2");
            }
        }
        class Child implements I1, I2 {
            @Override
            public void m1() {
                I1.super.m1();
                I2.super.m1();
                System.out.println("m1() method in  Child");
            }
        }
        Child child = new Child();
        child.m1();
    }
}
