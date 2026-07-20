package _03_control_statements._01_conditional;

import java.util.Map;

public class Demo7 {
    public static void main(String[] args) {
        // HDFC = 5%, ICICI=10%, SBI = 1%, Yes = 6%
        // what if 50 banks added offers?
        double discount = 0;
        double productPrice = 1000;
        double finalPayable = productPrice;
        String bank = "SBI";
        if (bank.equals("HDFC")) {
            discount = productPrice * 5 / 100;
        }
        if (bank.equals("ICICI")) {
            discount = productPrice * 10 / 100;

        }
        if (bank.equals("SBI")) {
            discount = productPrice * 1 / 100;
        }
        if (bank.equals("YES")) {
            discount = productPrice * 6 / 100;
        }

        finalPayable = finalPayable - discount;

        System.out.println("discount: " + discount);
        System.out.println("productPrice: " + productPrice);
        System.out.println("finalPayable: " + finalPayable);

        Map<String, Double> bankOffers = Map.of(
                "HDFC", 5.0,
                "ICICI", 6.0
        );




    }
}
