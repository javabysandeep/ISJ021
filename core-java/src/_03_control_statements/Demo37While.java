package _03_control_statements;

public class Demo37While {
    public static void main(String[] args) {
        int left = 0;
        int right = 5;

        /*while (left < right) {
            System.out.println(left + "\t" + right);
        }*/
        // 0 5 infinite

        /*while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
        }*/
        //0 5, 1 5 2 5 3 5 4 5

        while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
            right--;
        }
        // 0 5, 1 4, 2 3
    }
}
