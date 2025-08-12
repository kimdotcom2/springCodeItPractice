package org.example.objectorientedprogramming.ex4;

public class PaymentServiceTest {

    public static void main(String[] args) {

        UserAccount account = new UserAccount("D777");

        account.deposit(10000);

        try {
            account.withdraw(12000);
        } catch (IllegalStateException e) {
            System.out.println("0보다 커야 합니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("출금 오류");
        }

        PaymentService paymentService = new PaymentService();
        paymentService.paymentProcess(account, 7000);
        paymentService.paymentRefund(account, 7000);

        try {

            paymentService.paymentProcess(account, 10000);

        } catch (IllegalArgumentException e) {
            System.out.println("0보다 커야 합니다.");
        } catch (IllegalStateException e) {
            System.out.println("출금 오류");
        }

        try {

            paymentService.paymentProcess(account, -100);

        } catch (IllegalArgumentException e) {
            System.out.println("0보다 커야 합니다.");
        } catch (IllegalStateException e) {
            System.out.println("출금 오류");
        }

    }

}
