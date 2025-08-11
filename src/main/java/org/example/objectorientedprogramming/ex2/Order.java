package org.example.objectorientedprogramming.ex2;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    public Order(String orderId, Product product) {
        this(orderId, new ArrayList<>());
        this.products.add(product);
    }

    public Order(String orderId) {
        this(orderId, new ArrayList<>());
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addProducts(Product... products) {
        this.products.addAll(List.of(products));
    }

    public static void main(String[] args) {

    }

}
