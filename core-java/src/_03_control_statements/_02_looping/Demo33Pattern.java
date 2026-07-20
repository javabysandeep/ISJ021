package _03_control_statements._02_looping;

public class Demo33Pattern {
    public static void main(String[] args) {
        //Floyd's triangle
        /*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
        */
        int count = 1;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
