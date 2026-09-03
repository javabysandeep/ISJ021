package _11_exception_handling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            String str = "a";
            System.out.println(str.charAt(1));
            str = null;
            System.out.println(str.charAt(1));
        } catch (NullPointerException npe) {
            System.out.println("catch block");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("catch block");
        } catch (Exception e) {
            System.out.println("generic exception handler");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("main");
    }
}
