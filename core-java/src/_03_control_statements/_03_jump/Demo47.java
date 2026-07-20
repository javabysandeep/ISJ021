package _03_control_statements._03_jump;

public class Demo47 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 2:
                    break;
                default:
                    System.out.println(i);
            }
        }
        //output : 1, 3, 4, 5
    }
}
