package _03_control_statements._03_jump;

public class Demo43Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
    //output : 1, 2, 4, 5
}
