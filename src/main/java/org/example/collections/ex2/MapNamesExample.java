package org.example.collections.ex2;

import java.util.List;

public class MapNamesExample {

    public static void main(String[] args) {

        List<Integer> scores = List.of(90, 80, 70, 60);

        scores.stream()
                .map(n -> n.toString().length())
                .forEach(System.out::println);

    }

}
