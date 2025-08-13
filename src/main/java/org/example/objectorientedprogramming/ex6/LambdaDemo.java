package org.example.objectorientedprogramming.ex6;

public class LambdaDemo {

    public static void main(String[] args) {

        MyCalculator calculator = (a, b) -> {return  a + b;};
        System.out.println(calculator.calculate(10, 20));

    }

}
