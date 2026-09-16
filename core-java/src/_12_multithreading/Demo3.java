package _12_multithreading;

public class Demo3 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable, "thread1");
        Thread thread2 = new Thread(runnable);
        thread2.setName("thread2");

        thread1.run();
        thread2.run();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }

    }

}
