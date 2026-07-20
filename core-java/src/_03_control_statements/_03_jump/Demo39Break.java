package _03_control_statements._03_jump;

public class Demo39Break {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("loop body");
            break;
        }
        System.out.println("rest of main");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                break;
            }
        }
        //output : 0
    }
}
