package org.example.javaprogramming.ex3;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) break;
            System.out.println(i);
        }
    }
}
