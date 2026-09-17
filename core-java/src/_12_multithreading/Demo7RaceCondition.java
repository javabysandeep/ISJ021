package _12_multithreading;

public class Demo7RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        class Counter {
            int count = 0;
            synchronized void increment(){count++;}
            synchronized void decrement(){count--;}
        }
        Counter counter = new Counter();

        Runnable r1 = () -> {
            for(int i = 1; i <= 100000; i++){
                counter.increment();
            }
        };
        Thread t1 = new Thread(r1);

        Runnable r2 = () -> {
            for(int i = 1; i <= 100000; i++){
                counter.increment();
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("total count = "+counter.count);
    }
}
