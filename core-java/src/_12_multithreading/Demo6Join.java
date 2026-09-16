package _12_multithreading;

public class Demo6Join {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        }, "t1");
        t1.start();
//        t1.join();//infinite wait for t1
        t1.join(5000);
        for (int i = 11; i <= 20; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }
    }
}
