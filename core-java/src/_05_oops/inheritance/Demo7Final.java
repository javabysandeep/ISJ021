package _05_oops.inheritance;

public class Demo7Final {
    final int x;
    final static int y;

    {
        x = 100;
    }

    static {
        y = 100;
    }

    public static void main(String[] args) {
        final class Parent {
        }
        //class Child extends Parent{} //CTE as final classes cannot be extended

        final int a = 100;
        //a = 200;//CTE
    }
}
