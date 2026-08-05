package _05_oops.polymorphsim;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Addition of two numbers = " + add(10, 20));
        System.out.println("Addition of three numbers = " + add(10, 20, 30));
        System.out.println("Addition of four numbers = " + new Demo1().add(10, 20, 30, 40));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    final int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
