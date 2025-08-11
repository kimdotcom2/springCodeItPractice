package org.example.objectorientedprogramming.ex2;

public class PaymentService {

    private static final PaymentService INSTANCE = new PaymentService();

    private PaymentService() {
        //생성자 형성 차단
    }

    public static PaymentService getInstance() {
        return INSTANCE;
    }

    public boolean pay(Order order) {
        return true;
    }

}
