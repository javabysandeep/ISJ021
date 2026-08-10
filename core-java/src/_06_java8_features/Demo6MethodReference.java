package _06_java8_features;

public class Demo6MethodReference {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NotificationService {
            void notifyUser(String message);
        }

        //reference to static method : className ::methodName
        NotificationService notificationService1 = Demo6MethodReference::method1;

        //reference to non-static method : reference ::methodName
        Demo6MethodReference reference = new Demo6MethodReference(" ");
        NotificationService notificationService2 = reference::method2;

        //reference to constructor : className ::methodName
        NotificationService notificationService3 = Demo6MethodReference::new;

        notificationService1.notifyUser("hello");
        notificationService2.notifyUser("hello");
        notificationService3.notifyUser("hello");

    }

    public static void method1(String message) {
        System.out.println(message);
    }

    public void method2(String message) {
        System.out.println(message);
    }

    Demo6MethodReference(String message) {
        System.out.println(message);
    }
}
