package org.example.collections.ex2;

import java.util.Map;

public class MapEntryTransformationExample {

    public static void main(String[] args) {

        Map<Integer, String> scores = Map.of(1, "90", 2, "80", 3, "70", 4, "60");

        scores.entrySet().stream()
                .map(e -> e.getKey().toString().length())
                .forEach(System.out::println);


    }

}
