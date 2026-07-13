package _02_operators;

public class Demo3AssignmentOperator {
    public static void main(String[] args) {
        int variable1 = 100;
        int variable2 = 10 * 20;
        int variable3 = variable2;
        int variable4 = (int) Math.random()*10;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable4 = " + variable4);

        System.out.println(variable4=100); //100
       // System.out.println(100=100); //CTE
    }
}
