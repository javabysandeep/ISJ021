package _11_exception_handling;

public class Demo12 {
    public static void main(String[] args) {

        try {
            sendEmail("Abc");
        } catch (InvalidEmailException e) {
            System.out.println("invalid email handled in main");
        }

    }

    public static void sendEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email");
        }
        System.out.println("Email has been sent");
    }
}
