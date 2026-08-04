package _05_oops.inheritance;

public class Demo9CosmicClass {
    public static void main(String[] args) {

        class Parent /*extends Object*/ {
        }

        Parent p = new Parent();
        System.out.println(p.hashCode());
    }
}
