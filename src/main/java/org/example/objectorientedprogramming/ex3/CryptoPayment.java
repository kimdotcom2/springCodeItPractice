package org.example.objectorientedprogramming.ex3;

public class CryptoPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("암호화페 결제: " + amount + "원");
    }
}
