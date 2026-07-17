package _03_control_statements;

public class Demo27PalindromeNumber {
    public static void main(String[] args) {
        // palindrome : given number = reverse of given number
        // e.g. 12321 = 12321, 111
        int number = 12321;
        int orginalNumber = number;
        int reverse = 0;
        for (; number > 0; ) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        if (orginalNumber == reverse) {
            System.out.println("The palindrome number is " + orginalNumber);
        } else {
            System.out.println("The palindrome number is not " + orginalNumber);
        }


    }
}
