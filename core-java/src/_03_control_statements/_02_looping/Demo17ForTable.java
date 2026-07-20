package _03_control_statements._02_looping;

import java.util.Scanner;

public class Demo17ForTable {
    public static void main(String[] args) {
        // accept the input number and print its table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
//            System.out.println(number * i);

        }


    }
}
