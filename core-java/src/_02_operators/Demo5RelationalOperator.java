package _02_operators;

public class Demo5RelationalOperator {
    public static void main(String[] args) {
        //comparison operators : > , <, >=, <=, ==, !=
        System.out.println(10 > 10); //false
        System.out.println(10 < 10); // false
        System.out.println(10 >= 10); // true
        System.out.println(10 <= 10); //true
        System.out.println(10 == 10); //true
        System.out.println(10 != 10); //false
        //System.out.println(true == 10);//CTE
        //System.out.println(true != 10);//CTE

        System.out.println(11 % 2 == 0); //false
        System.out.println(11 % 2 == 1); //true
        System.out.println(11 % 2 == 2); // false

        //System.out.println('A' =="A");//CTE
        System.out.println('A' == 65);//true
        System.out.println('a' < 'A'); //false

        //System.out.println(5 > 3 > 1);//CTE
        System.out.println(10 == 10L); //true

        System.out.println(10 == 10.0);//true
        System.out.println(10 == 10.000000001);//false
        System.out.println(true == false);//false
        int a = 5;
        System.out.println(a++ == ++a);//false 5 ==6
        System.out.println(10 < 20 == true);//true

    }
}
