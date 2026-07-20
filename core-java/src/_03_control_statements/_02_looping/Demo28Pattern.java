package _03_control_statements._02_looping;

public class Demo28Pattern {
    public static void main(String[] args) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");

        System.out.println("solution 02");
        for (int row = 1; row <= 5; row++) {
            System.out.println("* * * * *");
        }

        System.out.println("solution 03");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
