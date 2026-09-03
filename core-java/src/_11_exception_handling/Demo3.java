package _11_exception_handling;

public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
