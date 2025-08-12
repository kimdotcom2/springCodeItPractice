package org.example.objectorientedprogramming.ex3;

public class CreditCardV2Payment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제취소 완료.");
    }
}
