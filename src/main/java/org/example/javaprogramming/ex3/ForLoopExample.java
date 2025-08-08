package org.example.javaprogramming.ex3;

public class ForLoopExample {

    public static void main(String[] args) {

        for (int i = 0; i <= 3000; i += 100) {
            System.out.println(i);
        }

        for (int i = 0; i <= 3000; i += 100) {
            for (int j = 1; j <= 100; j++) {
                System.out.println(i / j);
            }
        }

    }

}
