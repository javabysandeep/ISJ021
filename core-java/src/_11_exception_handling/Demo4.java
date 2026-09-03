package _11_exception_handling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (NullPointerException npe) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
