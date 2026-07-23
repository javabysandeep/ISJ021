package _04_classObject;

public class Demo5 {
    int a = 10;
    int b = 20;
    static int c = 3;

    public static void main(String[] args) {
        Demo5 ref = new Demo5();
        int a = 100;
        int b = 200;
        int c = 300;

        System.out.println("instance variable = " + ref.a);
        System.out.println("instance variable = " + ref.b);

        System.out.println("static variable = " + Demo5.c);

        System.out.println("local variable = " + a);
        System.out.println("local variable = " + b);
        System.out.println("local variable = " + c);


        int number;
        //System.out.println(number);//CTE :: local variables must be initialized before they are used
        number = 100;
        System.out.println(number);//100

    }
}
