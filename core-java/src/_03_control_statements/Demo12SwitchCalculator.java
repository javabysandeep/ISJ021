package _03_control_statements;

import java.util.Scanner;

public class Demo12SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1, number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+' -> System.out.println("Addition = " + (number1 + number2));
            case '-' -> System.out.println("Subtraction" + (number1 - number2));
            case '*' -> System.out.println("Multiplication" + (number1 * number2));
            case '/' -> System.out.println("Division" + (number1 / number2));
            case '%' -> System.out.println("Remainder" + (number1 % number2));
            default -> System.out.println("Invalid operator");
        }

    }
}
