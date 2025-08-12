package org.example.objectorientedprogramming.ex3;

public class MediumCreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("중간 금액(신용카드) 결제: " + amount + "원");
    }
}
