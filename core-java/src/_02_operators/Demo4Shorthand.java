package _02_operators;

public class Demo4Shorthand {
    public static void main(String[] args) {
        int sum = 0;
        //sum = sum + 10;
        sum += 10; //short hand
        System.out.println("sum = " + sum);//10

        int variable = 10;
        //variable = variable- 1;
        variable -=1;
        System.out.println("variable = " + variable);//9


        int variable2 = 10;
        //variable2 = variable2 * 10;
        variable2 *=10;
        System.out.println("variable2 = " + variable2);


        int variable3 = 10;
        //variable3 = variable3 /2;
        variable3 /=2;
        System.out.println("variable3 = " + variable3);
    }
}
