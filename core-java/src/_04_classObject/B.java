package _04_classObject;

public class B {
    void instanceMethodB() {
        //call instance method of class A
        A a = new A();

        a.findUserById(100);
//        this.findUserById(100); //CTE
        // this will refer to class B object and class A
    }

    static void staticMethodB() {
        //call instance method of class A
        A a = new A();
        a.findUserById(100);
    }
}