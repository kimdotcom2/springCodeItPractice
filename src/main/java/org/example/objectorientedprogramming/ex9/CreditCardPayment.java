package org.example.objectorientedprogramming.ex9;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("카드로 결제: " + amount);
    }

}
