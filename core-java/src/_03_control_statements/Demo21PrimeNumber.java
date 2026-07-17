package _03_control_statements;

import java.util.Scanner;

public class Demo21PrimeNumber {
    public static void main(String[] args) {
        // check if the number is prime or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        //prime number : which is only divisible by 1 and number itself
        //12 : 2 --> not prime
        //11 : 2,3,4,5, --> its prime
        // check if the number is divisible by numbers from 2 to n/2

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }


        if (isPrime) {
            System.out.println("Given number is prime");
        } else {
            System.out.println("Given number is not prime");
        }
    }
}
