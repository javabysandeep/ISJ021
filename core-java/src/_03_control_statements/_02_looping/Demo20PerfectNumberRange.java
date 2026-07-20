package _03_control_statements._02_looping;

public class Demo20PerfectNumberRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 10000; number++) {
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors += i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println("The perfect number is " + number);
            }
        }
    }
}
// 6
//28
//496
//8128