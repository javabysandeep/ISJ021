package _02_operators;

public class Demo6LogicalOperators {
    public static void main(String[] args) {
        //logical operators
        System.out.println("*********** Logical AND ***********");
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println("********* Logical OR **********");
        System.out.println(true || true);//true
        System.out.println(true || false); //true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        System.out.println("*********** Logical NOT **********");
        System.out.println(!true);//false
        System.out.println(!false);//true


        System.out.println(10 > 30 && 10 % 0 == 0); //false
        //System.out.println(10 > 3 && 10 % 0 == 0); //AE / by zero
        System.out.println(10 < 30 || 10 % 0 == 0);//true
        //System.out.println(10 > 30 || 10 % 0 == 0);//AE / by zero
    }
}
