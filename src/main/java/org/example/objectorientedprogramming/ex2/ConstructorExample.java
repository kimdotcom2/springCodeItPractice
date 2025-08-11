package org.example.objectorientedprogramming.ex2;

import java.util.ArrayList;
import java.util.List;

public class ConstructorExample {

    public static void main(String[] args) {

        Order order1 = new Order();
        System.out.println("order1 ID: " + order1.getOrderId());
        System.out.println("order1 isPaid: " + order1.isPaid());

        Order order2 = new Order("DDD");
        System.out.println("order2 ID: " + order2.getOrderId());
        System.out.println("order2 isPaid: " + order2.isPaid());

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("P001", "Laptop", 1200.0));
        productList.add(new Product("P002", "Mouse", 25.0));

        Order order3 = new Order("ORD002", productList);
        System.out.println("order3 ID: " + order3.getOrderId());
        System.out.println("order3 products: ");

        for (Product p : order3.getProducts()) {
            System.out.println("- " + p.getName() + " ($" + p.getPrice() + ")");
        }

    }

}
