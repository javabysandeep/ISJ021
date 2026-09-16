package _12_multithreading;

public class Demo1 {
    public static void main(String[] args) {
        //01. Traditional way
        class Worker implements Runnable {
            @Override
            public void run() {
                System.out.println("01. traditional way");

            }
        }
        Runnable worker1 = new Worker();
        worker1.run();

        //02. Anonymous way
        Runnable worker2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("02. anonymous way");
            }
        };
        worker2.run();

        //03. Lambda Expression
        Runnable worker3 = () -> System.out.println("03. lambda way");
        worker3.run();

        //04. Method reference
        Runnable worker4 =Demo1::display;
        worker4.run();
    }

    public static void display() {
        System.out.println("display");
    }
}
