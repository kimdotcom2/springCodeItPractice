package org.example.objectorientedprogramming.ex7;

public class PaymentMethodTest {


    public enum PaymentMethod {
        CREDIT_CARD("credit card"),
        ACCOUNT_TRANSFER( "account transfer"),
        MOBILE_PAYMENT( "mobile payment");

        private final String displayName;

        PaymentMethod(String displayName) {
            this.displayName = displayName;
        }

        public void getDisplayName() {
            System.out.println(this.displayName);
        }

    }

    public static void printPaymentMethod(PaymentMethod paymentMethod) {

        switch (paymentMethod) {
            case CREDIT_CARD:
                paymentMethod.getDisplayName();
                break;
            case ACCOUNT_TRANSFER:
                paymentMethod.getDisplayName();
                break;
            case MOBILE_PAYMENT:
                paymentMethod.getDisplayName();
                break;
        }

    }

    public static void main(String[] args) {

        for (PaymentMethod paymentMethod : PaymentMethod.values()) {
            printPaymentMethod(paymentMethod);
        }

    }

}
