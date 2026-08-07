package _05_oops.abstraction;

public class Demo3 {
    public static void main(String[] args) {

        interface PaymentService {
            void process();
        }
        class PaymentServiceImpl implements PaymentService {
            @Override
            public void process() {
                System.out.println("process");
            }
        }
        PaymentService paymentService = new PaymentServiceImpl();
        paymentService.process();


        interface I1{}
        interface I2{}
        interface I3{}

        class A implements I1, I2, I3{}
    }
}
