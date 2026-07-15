package _02_operators;

public class Demo8ConditionalOperator {
    public static void main(String[] args) {
        System.out.println(true ? "its true" : "its false");//its true
        System.out.println(false ? "its true" : "its false"); //its fals

        int number = 11;
        System.out.println(number % 2 == 0 ? "even number" : "odd number");

        int year = 2026;
        //leap year : year divisible by 400
        // leap year : year divisible by 4 but not divisible by 100
        System.out.println(
                year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
                        ? "its leap year"
                        : "not a leap year");

        int budget = 1000;
        System.out.println(budget > 50000 ? "trip is on" : "stay home stay safe");

    }
}
