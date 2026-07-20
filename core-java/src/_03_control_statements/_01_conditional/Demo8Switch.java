package _03_control_statements._01_conditional;

public class Demo8Switch {
    public static void main(String[] args) {
        int input = 1;
        //rule 01 : input type can be byte, short, int, char, String, enum otherwise CTE
        //rule 02 : input type and case label must be of same type
        //rule 03 : case label must be unique
        // input and case label will be checked for equality and matching case label statements will be executed
        // if no case label matches, then if default available it will be executed
        // if break statement is not there, then from matching case label, till end of switch or next break statement,
        // all the cases will be executed

        switch (input) {
            case 0: System.out.println("zero");break;
            case 1: System.out.println("one");break;
            case 2: System.out.println("two");break;
            case 3: System.out.println("three");break;
            case 4: System.out.println("four");break;
            case 5: System.out.println("five");break;
            case 6: System.out.println("six");break;
            case 7: System.out.println("seven");break;
            case 8: System.out.println("eight");break;
            case 9: System.out.println("nine");break;
            default:  System.out.println("invalid digit");break;
        }

    }
}
