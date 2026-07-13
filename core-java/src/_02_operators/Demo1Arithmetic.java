package _02_operators;

public class Demo1Arithmetic {
    public static void main(String[] args) {
        //Arithmetic Operators : +, -, *, /, %
        System.out.println(10 + 20); //30
        System.out.println(100 - 20); //80
        System.out.println(10 * 20); // 200

        System.out.println(100 / 20); // Division operation : Quotient = 5
        System.out.println(100 % 20); // Division operation : Remainder = 0

        System.out.println(10 % 20); // Remainder = 10
        System.out.println(10 / 20); // Quotient = 0


        System.out.println(1 / 10); // Quotient 0
        System.out.println(1 % 10); // Remainder = 1

        System.out.println(0 % 1); //0
        System.out.println(0 / 1); //0

        //ArithmeticException: / by zero
        //System.out.println(1 / 0);
        //System.out.println(1 % 0);
        System.out.println(1.0 / 0); //Infinity
        System.out.println(1.0 % 0); //NaN

        //expression --> Left to right : BODMAS
        System.out.println((10+20)*30 +100);  //1000

        //System.out.println(true + false); //CTE

        System.out.println( 'A' + 5); //70
        System.out.println(11 / 2); //5
        System.out.println(11.0 / 2); //5.5

        System.out.println(10 + 3.5);//13.5

        System.out.println('A' + 'A'); //130




    }
}
