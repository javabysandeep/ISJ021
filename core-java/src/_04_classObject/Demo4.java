package _04_classObject;

public class Demo4 {
    int a=10;
    int b=20;
    static int c = 3;

    public static void main(String[] args) {
        Demo4 ref1 = new Demo4();
        Demo4 ref2 = new Demo4();
        Demo4 ref3 = new Demo4();
        System.out.println("ref1: " + ref1.a + "\t" + ref1.b);
        System.out.println("ref2: " + ref2.a + "\t" + ref2.b);
        System.out.println("ref3: " + ref3.a + "\t" + ref3.b);
        System.out.println("static variable "+Demo4.c);
    }
}
