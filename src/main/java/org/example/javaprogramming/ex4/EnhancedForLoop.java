package org.example.javaprogramming.ex4;

public class EnhancedForLoop {

    public static void main(String[] args) {

        String[] animals = {"dog", "cat", "bird", "frog"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        for (String animal : animals) {
            System.out.println(animal);
        }

    }

}
