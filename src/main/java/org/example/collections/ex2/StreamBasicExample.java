package org.example.collections.ex2;

import java.util.List;

public class StreamBasicExample {

    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "orange", "grape");

        fruits.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

}
