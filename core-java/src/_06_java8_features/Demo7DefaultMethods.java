package _06_java8_features;

public class Demo7DefaultMethods {
    public static void main(String[] args) {

        interface NotificationService {
            int process(int number);

            default void process2() {
                System.out.println("Default method in interface");
            }
        }
        NotificationService n1 = new NotificationService() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        NotificationService n2 = new NotificationService() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        NotificationService n3 = new NotificationService() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };

        //................. 1cr subclasses
    }
}
