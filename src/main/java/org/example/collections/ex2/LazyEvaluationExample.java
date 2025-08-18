package org.example.collections.ex2;

import java.util.List;

public class LazyEvaluationExample {

    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "orange", "grape");

        var stream = fruits.stream()
                .filter(name -> {
                    System.out.println("filtering " + name);
                    return name.length() > 5;
                });

        stream.forEach(System.out::println);

    }

}
