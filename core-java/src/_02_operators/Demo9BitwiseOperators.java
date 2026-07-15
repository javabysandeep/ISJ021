package _02_operators;

public class Demo9BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("*********** Bitwise AND ***********");
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println(false & false);//false

        System.out.println("********* Bitwise OR **********");
        System.out.println(true | true);//true
        System.out.println(true | false); //true
        System.out.println(false | true);//true
        System.out.println(false | false);//false

        System.out.println("********* Bitwise XOR **********");
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false


        //bitwise and will solve entire expression
        //System.out.println(10 > 30 & 10 % 0 == 0); //AE / by zero
        //System.out.println(10 > 3 & 10 % 0 == 0); //AE / by zero
        //System.out.println(10 < 30 | 10 % 0 == 0);//AE / by zero
        //System.out.println(10 > 30 || 10 % 0 == 0);//AE / by zero

    }
}
