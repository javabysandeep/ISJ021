package _03_control_statements._01_conditional;

public class Demo3 {
    public static void main(String[] args) {
         /*
                (condition) = true, false
                true ---> if
                false --> else
          */
        int number = 11;
        if (number % 2 == 0) {
            System.out.println("number is even = " + number);
        }
        //System.out.println("lines between if and else are not allowed");
        else {
            System.out.println("number is odd =" + number);
        }
    }
}
