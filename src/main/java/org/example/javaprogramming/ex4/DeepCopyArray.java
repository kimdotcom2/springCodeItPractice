package org.example.javaprogramming.ex4;

public class DeepCopyArray {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        for (int i = 0; i < copy.length; i++) {
            copy[i] = original[i] + 100;
        }

        System.out.println(original[0]);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

    }

}
