package _03_control_statements;

public class Demo22PrimeRange {
    public static void main(String[] args) {

        for (int number = 1; number <= 100; number++) {
            // this logic is for to check if the given number is prime or not
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is prime");
            }
        }

    }
}
