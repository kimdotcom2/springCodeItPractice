package org.example.objectorientedprogramming.ex4;

public class PaymentService {

    public void paymentProcess(UserAccount account, double amount) {

        if (account.getBalance() < amount) {
            throw new IllegalStateException("출금 오류.");
        }

        account.withdraw(amount);
        System.out.println("결제 완료. 잔액: " + account.getBalance());

    }

    public void paymentRefund(UserAccount account, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("0보다 커야 합니다.");
        }

        account.deposit(amount);
        System.out.println("환불 완료. 잔액: " + account.getBalance());

    }

}
