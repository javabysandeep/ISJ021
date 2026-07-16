package _03_control_statements;

import java.util.Scanner;

public class Demo11Switch {
    public static void main(String[] args) {
        //accept the input from user and print the day name
        Scanner scanner = new Scanner(System.in); //object creation
        System.out.println("Enter the day number");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }
    }
}
