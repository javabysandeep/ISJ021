package _11_exception_handling;

public class Demo8Throws {
    public static void main(String[] args) {
        m1();
        System.out.println("rest of the main");
    }

    public static void m1() {
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage()+"\t handled in m1");
        }
    }
}
