package _03_control_statements._01_conditional;

public class Demo2 {
    public static void main(String[] args) {

        if (false) {
            System.out.println("1");
        }
        System.out.println("2");
        System.out.println("3");

        int number = 10;
        if (number % 2 == 0) {
            System.out.println("its an even number = " + number);
        }

        if (number % 2 != 0) {
            System.out.println("its an odd number = " + number);
        }

    }
}
