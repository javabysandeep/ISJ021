package _03_control_statements._03_jump;

public class Demo46 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i = " + i + ", j = " + j);
            }

        }
        //output :
      /*
        i = 1, j = 1
        i = 2, j = 1
        i = 3, j = 1
        i = 4, j = 1
        i = 5, j = 1
        i = 6, j = 1
        i = 7, j = 1
        i = 8, j = 1
        i = 9, j = 1
        i = 10, j = 1

      * */
    }
}
