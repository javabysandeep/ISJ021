package _03_control_statements;

public class Demo24DigitSum {
    public static void main(String[] args) {
        int number = 12345;
        int sumOfDigits = 0;
        for (; number > 0; ) {
            int lastDigit = number % 10;
            sumOfDigits += lastDigit;
            number = number / 10;
        }
        System.out.println("The sum of the digits is " + sumOfDigits);

         /*
          % / = equal to number of digits
         12345 % 10 = 5
         12345 / 10 = 1234

         1234 % 10 = 4
         1234 / 10 = 123

         123 % 10 = 3
         123 / 10 = 12

         12 % 10 = 2
         12 / 10 = 1

         1 % 10 = 1
         1 / 10 = 0
        */
    }
}
