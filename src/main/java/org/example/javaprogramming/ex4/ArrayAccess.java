package org.example.javaprogramming.ex4;

public class ArrayAccess {

    public static void main(String[] args) {

        int[] scores = {88, 92, 76};
        System.out.println(scores[0]);

        scores[1] = 95;
        System.out.println(scores[1]);

        for (int score : scores) {
            System.out.println(score);
        }

    }

}
