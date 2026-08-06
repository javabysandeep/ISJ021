package _05_oops.abstraction;

public class Demo1 {
    public static void main(String[] args) {
        //SOLID design principles
        //01. Single Responsibility Principle --> class should have single responsibility
        //02. Open Closed Principle --> Code is open for extension and closed for modification
        //03. Liskov Substitution rule --> case 03 : we can hold child class object using parent class reference
        //04. Inversion of Control
        //05. Dependency Injection

        abstract class Payment {
            double amount;

            public void generateReceipt() {
                System.out.println("Payment is Generating Receipt");
            }

            public abstract void validate();

            public abstract void processPayment();
        }
        class CreditCardPayment extends Payment {
            @Override
            public void validate() {
                System.out.println("Credit Card Payment is Valid");
            }

            @Override
            public void processPayment() {
                System.out.println("Credit card Payment is Processing Payment");
            }
        }
        class DebitCardPayment extends Payment {
            @Override
            public void validate() {
                System.out.println("Debit Card Payment is Valid");
            }

            @Override
            public void processPayment() {
                System.out.println("Debit Card Payment is Processing Payment");
            }
        }
        class UPIPayment extends Payment {
            @Override
            public void validate() {
                System.out.println("UPI Payment is Valid");
            }

            @Override
            public void processPayment() {
                System.out.println("UPI Payment is Processing Payment");
            }
        }

        Payment creditCardPayment = new CreditCardPayment();
        Payment debitCardPayment = new DebitCardPayment();
        Payment upiPayment = new UPIPayment();

        creditCardPayment.validate();
        debitCardPayment.validate();
        upiPayment.validate();

    }
}
