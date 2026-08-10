package _06_java8_features;

import java.util.function.Predicate;

public class Demo3LambdaExpression {
    public static void main(String[] args) {

        @FunctionalInterface
         interface Runnable {

            void run();
        }

        Runnable runnable = () -> {
            System.out.println("runnable implemented using lambda expression");
        };
        runnable.run();

       /*
           @FunctionalInterface
            public interface Predicate<T> {
                boolean test(T t);
            }

        */
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("isEven test for 10 using lambda expression " + isEven.test(10));//true
        System.out.println("isEven test for 11 using lambda expression " + isEven.test(11));//false
    }
}
