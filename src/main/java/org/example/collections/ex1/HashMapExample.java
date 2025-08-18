package org.example.collections.ex1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Korea", 90);
        scores.put("USA", 80);
        scores.put("Japan", 70);
        scores.put("Germany", 60);

        System.out.println(scores);

        scores.put("France", 95);
        scores.put("France", 90);
        System.out.println(scores);

        System.out.println(scores.containsKey("France"));
        scores.remove("France");
        System.out.println(scores);

    }

}
