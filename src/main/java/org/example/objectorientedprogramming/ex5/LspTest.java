package org.example.objectorientedprogramming.ex5;

public class LspTest {

    public static void main(String[] args) {

        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.getArea());

        Shape square = new Square(5);
        System.out.println("Square area: " + square.getArea());

    }

}
