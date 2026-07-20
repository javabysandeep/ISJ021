package _03_control_statements._01_conditional;

public class Demo5 {
    public static void main(String[] args) {
        /*
            TCS criteria
            passout = 2026, 2025
            10th  > 60
            12th > 60
            grad > 60
            gap =0

        * */
        int passingYear = 2026;
        int sscMarks = 65;
        int hscMarks = 65;
        int gradMarks = 65;
        int gap = 0;
        if (passingYear >= 2025 && sscMarks >= 60
                && hscMarks >= 60 && gradMarks >= 60 && gap == 0) {
            System.out.println("Profile shortlisted");
        } else {
            System.out.println("profile rejected");
        }

    }
}
