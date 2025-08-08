package org.example.javaprogramming.ex4;

public class ShallowCopyArray {

    public static void main(String[] args) {

        int[] original = {1, 2, 3};
        int[] copy = original;
        copy[0] = 100;
        copy[1] = 200;
        copy[2] = 300;

        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }

    }
}
