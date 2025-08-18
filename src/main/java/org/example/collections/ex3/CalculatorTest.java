package org.example.collections.ex3;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator plus = (a, b) -> a + b;

        System.out.println(plus.calculate(10, 20));

    }

}
