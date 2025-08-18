package org.example.collections.ex2;

import java.util.List;

public class ForEachFruitsExampleLambda {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "orange", "grape");

        fruits.forEach(f -> System.out.println(f));

    }
}
