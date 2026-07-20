package _03_control_statements._03_jump;

public class Demo41Return {
    public static void main(String[] args) {
     /*   for (; ; ) {
            System.out.println("loop body");
            return;
        }*/
        //unreachable code error

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("rest of main");
        //output : 0
    }
}
