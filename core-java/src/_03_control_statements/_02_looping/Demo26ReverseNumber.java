package _03_control_statements._02_looping;

public class Demo26ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;
        for (; number > 0; ) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
          /*
          reverse = 0
          0 * 10 + 5 = 5
          5  * 10 + 4 = 54
          54 * 10 +3 = 543
          543 * 10 + 2 = 5432
          5432 * 10 +1 = 54321

          5, 4, 3, 2, 1
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
