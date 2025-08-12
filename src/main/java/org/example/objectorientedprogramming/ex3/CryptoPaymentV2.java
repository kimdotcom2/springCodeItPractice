package org.example.objectorientedprogramming.ex3;

public class CryptoPaymentV2 extends AbstractPaymentV2{
    @Override
    public void pay(double amount) {
        System.out.println("암호화페 결제: " + amount + "원");
    }
}
