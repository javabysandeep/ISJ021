package _02_operators;

public class Demo2StringConcatenation {
    public static void main(String[] args) {
        System.out.println(10 + 20); // addition = 30
        System.out.println("10" + 20); // concatenation = 1020
        System.out.println('A'+10); //75
        System.out.println('A'+"10"); //A10
        System.out.println('A'-10);//55
        System.out.println('A'+"A"+'A'); //AAA
        System.out.println('A'+'A'+"A");//130A
    }
}
