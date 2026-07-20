package _03_control_statements._01_conditional;

public class Demo9SwitchUpgrade {
    public static void main(String[] args) {
        int input = 11;
        //rule 01 : input type can be byte, short, int, char, String, enum otherwise CTE
        //rule 02 : input type and case label must be of same type
        //rule 03 : case label must be unique
        // input and case label will be checked for equality and matching case label statements will be executed
        // if no case label matches, then if default available it will be executed
        // if break statement is not there, then from matching case label, till end of switch or next break statement,
        // all the cases will be executed

        switch (input) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            case 6 -> System.out.println("six");
            case 7 -> System.out.println("seven");
            case 8 -> System.out.println("eight");
            case 9 -> System.out.println("nine");
            default -> System.out.println("invalid digit");
        }

    }
}
