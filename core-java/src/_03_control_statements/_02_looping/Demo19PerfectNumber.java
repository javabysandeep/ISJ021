package _03_control_statements._02_looping;

import java.util.Scanner;

public class Demo19PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        if (sumOfFactors == number) {
            System.out.println("The perfect number is " + number);
        } else {
            System.out.println("The perfect number is not " + number);
        }
    }
}
