package _11_exception_handling;

public class Demo9Throws {
    public static void main(String[] args) {
        try {
            m1();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "\t handled in main");
        }
        System.out.println("rest of the main");
    }

    public static void m1() throws ArithmeticException {

        System.out.println(10 / 0);

    }
}
