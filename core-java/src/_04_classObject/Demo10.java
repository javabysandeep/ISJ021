package _04_classObject;

public class Demo10 {
    public static void main(String[] args) {
        // we have to call instance method
        // from different places within the same class

        //01. calling instance method from static method within the same class
        // answer : we need reference to call instance method
        Demo10 reference = new Demo10();
        reference.findUserById(10);
        reference.instanceMethod();
    }

    public void findUserById(int id) {
        System.out.println("user found with id in database");
    }

    public void instanceMethod() {
        //02. calling instance method from instance method within the same class
        // answer : we need reference to call instance method
        // instance method will have this reference
        findUserById(100);
        this.findUserById(100);

    }

}
