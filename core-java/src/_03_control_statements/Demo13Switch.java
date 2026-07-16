package _03_control_statements;

import java.util.Scanner;

public class Demo13Switch {
    public static void main(String[] args) {
        System.out.println("Select the payment mode from the given options");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. Net banking");

        Scanner sc = new Scanner(System.in);
        int paymentMode = sc.nextInt();
        switch (paymentMode) {
            case 1 -> System.out.println("UPI payment processing logic");
            case 2 -> System.out.println("Credit card payment processing logic");
            case 3 -> System.out.println("Debit card payment processing logic");
            case 4 -> System.out.println("Net bank payment processing logic");
            default -> System.out.println("Invalid selection");
        }

    }
}
