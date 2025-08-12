package org.example.objectorientedprogramming.ex3;

public class Order {

    private Payment payment;
    private AbstractPaymentV2 abstractPayment;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public Order(AbstractPaymentV2 abstractPayment) {
        this.abstractPayment = abstractPayment;
    }

    public void process(double amount) {
        //payment.pay(amount);
        abstractPayment.pay(10000);
    }

    public void cancel(double amount) {
        abstractPayment.cancel(amount);
    }

}
