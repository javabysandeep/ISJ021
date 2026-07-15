package _03_control_statements;

public class Demo10SwitchUpgrade {
    public static void main(String[] args) {
        int input = 11;
        String output = switch (input) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "invalid digit";
        };
        System.out.println(output);

    }
}
