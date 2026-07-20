package _03_control_statements._02_looping;

public class Demo29Pattern {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
