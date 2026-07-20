package _03_control_statements._03_jump;

public class Demo50OddNumbers {
    public static void main(String[] args) {
        //  print odd numbers using continue
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
