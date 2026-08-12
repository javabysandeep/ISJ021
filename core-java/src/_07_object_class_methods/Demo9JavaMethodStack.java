package _07_object_class_methods;

public class Demo9JavaMethodStack {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 22;
        display(number1, number2);
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }

    public static void display(int number1, int number2) {
        number1 = 100;
        number2 = 200;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
