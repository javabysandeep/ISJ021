package _03_control_statements._02_looping;

public class Demo25DigitCount {
    public static void main(String[] args) {
        //find the count of digits in the given number
        int number = 0;
        int digitCount = 0;
        if (number == 0) {
            digitCount++;
        }
        for (; number > 0; ) {
            number /= 10;
            digitCount++;
        }
        System.out.println("digitCount: " + digitCount);

    }
}
