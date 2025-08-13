package org.example.objectorientedprogramming.ex5;

public class PaymentProcessorTest {

    public static void main(String[] args) {

        Payment[] payments = {new CreditCardPayment(), new AccountTransferPayment(), new MobilePayment()};
        double[] amounts = {10000, 20000, 30000};

        PaymentProcessor processor = new PaymentProcessor();

        for (Payment payment : payments) {

            if (payment instanceof CreditCardPayment) {
                payment.pay(amounts[0]);
            } else if (payment instanceof AccountTransferPayment) {
                payment.pay(amounts[1]);
            } else if (payment instanceof MobilePayment) {
                payment.pay(amounts[2]);
            }

        }

    }

}
