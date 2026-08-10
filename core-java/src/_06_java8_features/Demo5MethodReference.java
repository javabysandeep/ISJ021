package _06_java8_features;

public class Demo5MethodReference {
    public static void main(String[] args) {
        @FunctionalInterface
        interface NotificationService {
            void notifyUser(String message);
        }
        //creating subclass of NotificationService
        NotificationService notificationService =
                (message) -> System.out.println(message);
        notificationService.notifyUser("hello");

        //method reference
        NotificationService  notificationService2 = System.out::println;
        notificationService2.notifyUser("hello");
    }
}
