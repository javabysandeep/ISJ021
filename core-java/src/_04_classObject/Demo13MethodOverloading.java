package _04_classObject;

public class Demo13MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5f, 20.5f));
        main();
    }
    public static void main() {
        System.out.println("overloaded main method");
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

   /* public static int add(int number2, int number1) {
        return number1 + number2;
    }*/

    public static float add(float number1, float number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }


}
