package _06_java8_features;

public class Demo4MethodReference {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Processor {
            int process(int number);
        }

        //01. traditional way
        class Square implements Processor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
        Processor square = new Square();
        System.out.println("square using traditional way = " + square.process(10));


        //02. anonymous way of creating subclass of a functional interface
        Processor cube = new Processor() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };
        System.out.println("cube using anonymous way = " + cube.process(10));


        //03. lambda expression way of creating subclass of a functional interface
        Processor cubeLambda = number -> number * number * number;
        System.out.println("cube using lambda expression way = " + cubeLambda.process(10));

        //04. method reference way of creating subclass of a functional interface
        Processor methodReference = Demo4MethodReference::alreadyDefinedMethod;
        System.out.println("methodReference using lambda expression way = " + methodReference.process(10));
    }

    public static int alreadyDefinedMethod(int number) {
        return number * number;
    }

}
