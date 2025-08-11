package org.example.objectorientedprogramming.ex2;

import static org.example.objectorientedprogramming.ex2.Utility.applyDiscount;

public class EcommerceApp {

    public static void main(String[] args) {
        double originalPrice = 10000;
        double finalprice = applyDiscount(originalPrice);
        System.out.println("할인 적용된 가격: " + finalprice);
    }

}
