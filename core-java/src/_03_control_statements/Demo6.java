package _03_control_statements;

public class Demo6 {
    public static void main(String[] args) {
        int input = 0;
        if (input == 0) System.out.println("zero");
        if (input == 1) System.out.println("one");
        if (input == 2) System.out.println("two");
        if (input == 3) System.out.println("three");
        if (input == 4) System.out.println("four");
        if (input == 5) System.out.println("five");
        if (input == 6) System.out.println("six");
        if (input == 7) System.out.println("seven");
        if (input == 8) System.out.println("eight");
        if (input == 9) System.out.println("nine");
        if (input < 0 && input > 9) System.out.println("invalid digit");
    }
}
