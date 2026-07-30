package _05_oops;

public class Demo3Singleton {
    public static void main(String[] args) {
        // Singleton s1 = new Singleton();//CTE
        //Singleton s2 = new Singleton();//CTE
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}