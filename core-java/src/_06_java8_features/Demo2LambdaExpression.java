package _06_java8_features;

public class Demo2LambdaExpression {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Processor {
            int process(int number);
        }

        //01. creating subclass of a functional interface using traditional way
        class Square implements Processor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
        Processor square = new Square();
        System.out.println("Processing Square using traditional way" + square.process(10));//100


        //02. creating subclass of a functional interface using anonymous way
        Processor cube = new Processor() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };
        System.out.println("Processing cube using anonymous way" + cube.process(10));//100


        //03. creating subclass of a functional interface using lambda way
        Processor lambdaCube =
                number -> number * number * number;

        System.out.println("Processing cube using lambda way" + lambdaCube.process(10));//100
    }
}
