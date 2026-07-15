package _02_operators;

public class Demo7LogicalOperators {
    public static void main(String[] args) {
        System.out.println(123 % 10);//3
        System.out.println(12 % 10);//2
        System.out.println(1 % 10);//1

        System.out.println(123 / 10);//12
        System.out.println(12 / 10);//1
        System.out.println(1 / 10);//0

        int number = 123;
        int sum = 0;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        System.out.println("sum = " + sum);//6


        //leap year --> year divisible by 4 and if it is century then divisible by 400
        int year = 2024;
        System.out.println(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)); //true

    }
}
