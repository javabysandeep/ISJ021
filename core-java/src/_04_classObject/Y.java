package _04_classObject;

public class Y {
    void instanceMethod() {
        System.out.println("Y: instance method");
        //call X class static method
        X x = new X();
        X.staticMethod();
        x.staticMethod();
    }

    static void staticMethod() {
        System.out.println("Y: static method");
        //call X class static method
        X x = new X();
        X.staticMethod();
        x.staticMethod();
    }
}