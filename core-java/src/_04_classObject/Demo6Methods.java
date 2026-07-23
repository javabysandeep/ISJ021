package _04_classObject;

public class Demo6Methods {
    //main method definition
    // main method call ---> java Demo6Methods Good morning
    public static void main(String[] args) {
        System.out.println("main method");

        // 100, 200 ---> ,method arguments
        System.out.println("method call = " + Demo6Methods.add(100, 200));
    }

    //int number1, int number2) are input parameters
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}
