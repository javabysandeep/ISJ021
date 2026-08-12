package _07_object_class_methods;

public class Demo8JavaMethodExecutionStack {
    public static void main(String[] args) {
        int variable = 1;
        m1();
    }

    private static void m1() {
        int variable = 2;
        m2();
    }

    private static void m2() {
        int variable = 3;
        m3();
    }

    private static void m3() {
        int variable = 4;
        System.out.println("m3");
    }
}
