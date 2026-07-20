package _03_control_statements._03_jump;

public class Demo49 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            break;
            //unreachable code error
            // System.out.println(i);
        }

        //  print odd numbers
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    // 1, infinite continue as i value does not change
}
