package org.example.objectorientedprogramming.ex7;

public class EnumSwitchTest {

    public enum OrderStatus {
        PENDING, SHIPPED, DELIVERED
    }

    public static void printStatus(OrderStatus orderStatus) {
        switch (orderStatus) {
            case PENDING:
                System.out.println("Order is pending");
                break;
            case SHIPPED:
                System.out.println("Order is shipped");
                break;
            case DELIVERED:
                System.out.println("Order is delivered");
                break;
        }
    }

    public static void main(String[] args) {

        OrderStatus orderStatus = OrderStatus.SHIPPED;

        for (OrderStatus status : OrderStatus.values()) {
            printStatus(status);
        }

    }

}
