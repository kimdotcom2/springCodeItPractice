package org.example.objectorientedprogramming.ex4;

public class OrderService {


    public void paymentProcess(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
