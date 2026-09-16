package _12_multithreading;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable, "thread1");
        Thread thread2 = new Thread(runnable);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }

    }

}
