package org.example.objectorientedprogramming.ex4;

public class PolymorphismTest {

    public static void main(String[] args) {

        Payment[] payments = {new CreditCardPayment(), new BankAccountTransferPayment(), new CryptoPayment()};
        double[] amounts = {10000, 20000, 30000};

        OrderService orderService = new OrderService();

        for (double amount : amounts) {

            for (Payment payment : payments) {

                if (payment instanceof CryptoPayment) {

                    System.out.println("지갑 동기화 중");
                    System.out.println("지갑 동기화 완료");

                    orderService.paymentProcess(payment, amount);

                } else {
                    orderService.paymentProcess(payment, amount);
                }

            }

        }

    }

}
