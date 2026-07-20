package _03_control_statements._03_jump;

public class Demo40Continue {
    public static void main(String[] args) {
       /* for (; ; ) {
            System.out.println("loop body");
            continue;
        }*/
        //infinite

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        //odd numbers

    }
}
