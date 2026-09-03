package _11_exception_handling;

public class Demo11Throw {
    public static void main(String[] args) {
        //System.out.println(10 / 0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
        //throw new ArithmeticException(" / by zero");
        try {
            System.out.println(10 / 0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
            //throw new ArithmeticException(" / by zero");
        } catch (ArithmeticException e) {
            System.out.println("catch block");
        }
    }
}
