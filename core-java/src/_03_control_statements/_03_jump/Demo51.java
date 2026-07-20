package _03_control_statements._03_jump;

public class Demo51 {
    public static void main(String[] args) {
        // Fibonacci series
        //1 2 3 5 8 13 21...
        // 50
        int sum = 0;
        int temp = 0;
        for (int i = 1, j = 2; i < 50 && j <= 50; i++, j++) {
            sum = i + j;
            temp = temp + sum;
            System.out.print(temp + ", ");
        }
        //    i = 1, 2, 3, 4, 5, 6,  7,  8,  9
        //    j = 2, 3, 4, 5, 6, 7,  8,  9,  10
        // i +j = 3, 5, 7, 9, 11, 13, 15, 17, 19
    }
}
