package org.example.javaprogramming.ex3;

public class BreakContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            } else if (i % 7 == 0) {
                break;
            }

            System.out.println("i = " + i);

        }

    }

}
