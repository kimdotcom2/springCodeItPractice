package org.example.objectorientedprogramming.ex4;

public class Order {

    private String orderId;
    private Delivery delivery;

    public Order(String orderId, String trackingNumber, String carrier) {
        this.orderId = orderId;
        this.delivery = new Delivery(trackingNumber, carrier);
    }

    public void startOrderDelivery() {
        if (delivery != null) {
            delivery.startDelivery();
        } else {
            System.out.println("배송 정보가 없습니다.");
        }
    }

}
