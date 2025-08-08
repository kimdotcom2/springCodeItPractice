package org.example.javaprogramming.ex3;

public class ContinueExample {

    public static void main(String[] args) {
        for (int i = 10; i <= 1; i--) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }

}
