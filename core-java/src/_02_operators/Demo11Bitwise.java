package _02_operators;

public class Demo11Bitwise {
    public static void main(String[] args) {
        //<<, >>, ~
        System.out.println("left shift"); //increase
        // 0000 100
        // 0001 000
        // 001 0000
        // 01 00000
        System.out.println(4 << 1); //8 : op1 * 2^op2 = 4 * 2 ^1 = 8
        System.out.println(4 << 2); //16 : op1 * 2^op2 = 4 * 2 ^2 = 16
        System.out.println(4 << 3); //32 : op1 * 2^op2 = 4 * 2 ^3 =32

        //math formula  for left shift = op1 * 2^op2 = 4 * 2 ^1 = 8
        //math formula  for right shift = op1 / 2^op2 = 4 / 2 ^1 = 2


        // 0000 100
        // 0000 010
        // 0000 001
        // 0000 000
        System.out.println("right shift"); //decrease
        System.out.println(4 >> 1);//2 : op1 / 2^op2 = 4 / 2 ^1 = 2
        System.out.println(4 >> 2);//1 : op1 / 2^op2 = 4 / 2 ^2 = 1
        System.out.println(4 >> 3);//0: op1 / 2^op2 = 4 / 2 ^3 = 0


        System.out.println("bitwise negation operator");
        // formula : add one and change the sign -->
        System.out.println(~4); // 4+1 => 5 => -5
        System.out.println(~-5); // -5+1 => -4 => 4
    }
}
