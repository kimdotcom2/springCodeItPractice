package org.example.objectorientedprogramming.ex6;

@FunctionalInterface
public interface MyCalculator {

    int calculate(int a, int b);

    default void doSomethingElse() {
        System.out.println("MyFunctionalInterface: doSomethingElse()");
    }

}
