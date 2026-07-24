package _04_classObject;

public class Demo11MethodCallDifferentClass {
    public static void main(String[] args) {
        Demo11MethodCallDifferentClass ref = new Demo11MethodCallDifferentClass();

        // calling static method from another static method within the same class

        Demo11MethodCallDifferentClass.staticMethod();// recommended
        staticMethod();//not recommended
        ref.staticMethod();//not recommended


    }

    public static void staticMethod() {
        System.out.println("A: staticMethod");
    }

    void instanceMethod() {
        Demo11MethodCallDifferentClass.staticMethod();// recommended
        staticMethod();//not recommended
        this.staticMethod();//not recommended

    }

}
