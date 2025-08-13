package org.example.objectorientedprogramming.ex5;

public class PaymentProcessorTest {

    public static void main(String[] args) {

        Payment[] payments = {new CreditCardPayment(), new AccountTransferPayment(), new MobilePayment()};
        double[] amounts = {10000, 20000, 30000};

        PaymentProcessor processor = new PaymentProcessor();

        for (Payment payment : payments) {

            if (payment instanceof CreditCardPayment) {
                processor.processPayment(payment, amounts[0]);
            } else if (payment instanceof AccountTransferPayment) {
                processor.processPayment(payment, amounts[1]);
            } else if (payment instanceof MobilePayment) {
                processor.processPayment(payment, amounts[2]);
            }

        }

    }

}
