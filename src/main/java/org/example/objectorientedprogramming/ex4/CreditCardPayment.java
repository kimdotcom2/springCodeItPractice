package org.example.objectorientedprogramming.ex4;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {

        if (amount <= 10000) {
            System.out.println("소액 신용카드 결제: " + amount + "원");
        } else if (amount <= 1000000) {
            System.out.println("중간 금액 신용카드 결제: " + amount + "원");
        } else {
            System.out.println("고액 신용카드 결제: " + amount + "원");
        }

    }
}
