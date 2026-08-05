package _05_oops.polymorphsim;

public class Demo2 {
    public static void main(String[] args) {
        class UserService {
            protected void notifyUser(String message)  {
                System.out.println("notified using email." + message);
            }
        }
        class UserServiceImpl extends UserService {
            @Override
            public void notifyUser(String message)  {
                System.out.println("notified using whatsApp." + message);
            }
        }

        UserService userService = new UserServiceImpl();
        userService.notifyUser("Hello");
    }
}
