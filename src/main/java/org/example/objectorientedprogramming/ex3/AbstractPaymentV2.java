package org.example.objectorientedprogramming.ex3;

public abstract class AbstractPaymentV2 {

    public abstract void pay(double amount);

    public void cancel(double amount) {
        System.out.println("결제 취소: " + amount + "원");
    }

}
