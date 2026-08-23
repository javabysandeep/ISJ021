package _10_collection._1_listDemos;

public class Demo11WrapperClasses {
    public static void main(String[] args) {
        Byte a = 10; // autoboxing
        byte b = a; // unboxing
        double doubleValue = a.doubleValue();
        System.out.println("byte converted to double: " + doubleValue);
    }
}
