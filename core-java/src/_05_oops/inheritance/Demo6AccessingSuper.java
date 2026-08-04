package _05_oops.inheritance;

public class Demo6AccessingSuper {
    public static void main(String[] args) {
        class Parent {
            public int x = 1;
            public int y = 2;
            public int z = 3;
        }
        class Child extends Parent {
            int x = 10;
            int y = 20;
            int z = 30;

            void show() {
                int x = 100;
                int y = 200;
                int z = 300;
                System.out.println("*********** Local variables ********* ");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);

                System.out.println("************* instance variables from Child *********");
                System.out.println("x = " + this.x);
                System.out.println("y = " + this.y);
                System.out.println("z = " + this.z);

                System.out.println("************* instance variables from Parent *********");
                System.out.println("x = " + super.x);
                System.out.println("y = " + super.y);
                System.out.println("z = " + super.z);
            }
        }
        Child child = new Child();
        child.show();
    }
}
/*
    *********** Local variables *********
        x = 100
        y = 200
        z = 300
        ************* instance variables from Child *********
        x = 10
        y = 20
        z = 30
        ************* instance variables from Parent *********
        x = 1
        y = 2
        z = 3
* */