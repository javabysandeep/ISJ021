package _11_exception_handling;

public class Demo1 {
    public static void main(String[] args) {
        String str = null;//NullPointerException: Cannot invoke "String.length()" because "str" is null
        System.out.println(str.length());//
        System.out.println(new int[]{}[0]);//ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        System.out.println(10/0);//ArithmeticException: / by zero
        System.out.println("rest of the main method");

//        NullPointerException;
//        ArrayIndexOutOfBoundsException;
//        ArithmeticException;

    }
}
