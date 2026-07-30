package _04_classObject.accessSpecifier.p1;

public class A {
    private static int x = 10;
    static int y = 20;
    protected static int z = 30;
    public static int w = 30;

    void display() {
        System.out.println("A::display");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);
    }
}

class Test {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        //System.out.println("x: " + A.x);//x is private
        System.out.println("y: " + A.y);
        System.out.println("z: " + A.z);
        System.out.println("w: " + A.w);
    }
}
