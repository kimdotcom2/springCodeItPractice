package org.example.objectorientedprogramming.ex2;

public class Utility {

    public static final double DISCOUNT_RATE;

    static {
        DISCOUNT_RATE = 0.3;
    }

    public static double applyDiscount(double price) {
        return price * (1 - DISCOUNT_RATE);
    }

    public static void main(String[] args) {

    }

}
