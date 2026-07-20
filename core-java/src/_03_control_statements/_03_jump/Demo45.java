package _03_control_statements._03_jump;

public class Demo45 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    //output : 0, 1,3,5,7,9
}
