package org.example.collections.ex3;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator plus = (a, b) -> a + b;

        System.out.println(plus.operate(10, 20));

        Calculator minus = (a, b) -> a - b;

        System.out.println(minus.operate(10, 20));

    }

}
