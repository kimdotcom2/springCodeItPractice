package org.example.objectorientedprogramming.ex3;

public class Topic03ExampleMain {

    public static void main(String[] args) {
        Order o1 = new Order(new CreditCardPayment());
        //o1.process(10000);

        Order o2 = new Order(new BankAccountTransferPayment());
        //o2.process(10000);

        Order o3 = new Order(new CryptoPayment());
        //o3.process(10000);

        Order o4 = new Order(new CryptoPaymentV2());
        o4.process(10000);
        o4.cancel(10000);

    }

}
