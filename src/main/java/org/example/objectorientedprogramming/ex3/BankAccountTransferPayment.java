package org.example.objectorientedprogramming.ex3;

public class BankAccountTransferPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
}
