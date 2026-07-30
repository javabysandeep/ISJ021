package _04_classObject.accessSpecifier.p2;

import _04_classObject.accessSpecifier.p1.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
//        a.display(); //CTE
//        System.out.println("x: " + A.x);//x is private
//        System.out.println("y: " + A.y);//y is default
//        System.out.println("z: " + A.z); // z is protected
        System.out.println("w: " + A.w); // w is public
    }
}
