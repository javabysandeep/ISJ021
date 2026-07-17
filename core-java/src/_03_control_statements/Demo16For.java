package _03_control_statements;

public class Demo16For {
    public static void main(String[] args) {
        // print 1 to 50 even numbers
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("solution 02");
        for (int i = 2; i <= 50; i = i + 2) {
            System.out.println(i);
        }


    }
}
