package org.example.objectorientedprogramming.ex3;

public class BankAccountTransferV2Payment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {

    }
}
