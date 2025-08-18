package org.example.collections.ex2;

import java.util.Map;

public class MapEntryTransformationExampleLambda {
    public static void main(String[] args) {

        Map<String, Integer> scores = Map.of("Korea", 90, "USA", 80);

        scores.entrySet().stream()
                .filter(e -> e.getValue() >= 80)
                .map(e -> e.getKey() + " " + e.getValue())
                .forEach(System.out::println);

    }
}
