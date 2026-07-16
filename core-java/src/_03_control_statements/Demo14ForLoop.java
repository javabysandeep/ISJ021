package _03_control_statements;

public class Demo14ForLoop {
    public static void main(String[] args) {
        /*for (;;){
            System.out.println("for loop body");
        }*/
        // unreachable code error
        // above loop is infinite and control will never come out of that
        /*for (;true;){
            System.out.println("for loop body");
        }*/
        /*for (;2 > 1;){
            System.out.println("for body");
        }*/
        //infinite loop
        for (System.out.println("initialization");
             true;
             System.out.println("increment/decrement")
        ) {
            System.out.println("for body");
        }


    }
}
