package _03_control_statements._01_conditional;

public class Demo4MaxOfThreeNumbers {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        System.out.println("************** Max of two numbers *************");
        if (number1 > number2) {
            System.out.println("max = " + number1);
        } else {
            System.out.println("max = " + number2);
        }
        System.out.println("************** Max of three numbers *************");

       /* if (number1 > number2 && number1 > number3) {
            System.out.println("max = " + number1);
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println("max = " + number2);
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println("max = " + number3);
        }*/

        if (number1 > number2 && number1 > number3) {
            System.out.println("max = " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("max = " + number2);
        } else {
            System.out.println("max = " + number3);
        }

        System.out.println("************** Max of three numbers using conditional operator *************");
        System.out.println(
                number1 > number2 && number1 > number3
                        ? "max =" + number1
                        : number2 > number1 && number2 > number3
                          ? "max=" + number2
                          : "max=" + number3
        );
    }
}
