package _03_control_statements;

public class Demo18For {
    public static void main(String[] args) {
        //find the factors of a given number
        // 6 = 1,2,3
        // factors of 100 are = 1,2,4,5, 10, 20, 25, 50
        // these numbers divide 100 and gets remainder as 0
        // 100 % 1 = 0
        // 100 % 2 = 0
        // 100 % 4 = 0
        // 100 % 5 = 0
        // 100 % 10 = 0
        // 100 % 20 = 0
        // 100 % 25 = 0
        // 100 % 50 = 0
        // maximum factor will be N/2 and minimum will be 1

        int number = 28;
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sumOfFactors += i;
            }
        }
        System.out.println("given number = " + number);
        System.out.println("sum of factors = " + sumOfFactors);

        // perfect number : sum of factors == given number
    }
}
