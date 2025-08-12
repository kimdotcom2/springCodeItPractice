package org.example.objectorientedprogramming.ex4;

public class PaymentServiceTest {

    public static void main(String[] args) {

        UserAccount account = new UserAccount("D777");

        account.deposit(10000);

        try {
            account.withdraw(12000);
        } catch (IllegalStateException e) {
            System.out.println("잔액과 같거나 작은 금액을 입력하세요.");
        }

        PaymentService paymentService = new PaymentService();
        paymentService.paymentProcess(account, 7000);
        paymentService.paymentRefund(account, 7000);

        try {

            paymentService.paymentProcess(account, -100);

        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다.");
        }

    }

}
