package org.example.collections.ex1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> countries = new HashSet<>();
        countries.add("Korea");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        System.out.println(countries);

        System.out.println(countries.contains("Korea"));
        System.out.println(countries.size());
        countries.clear();
        System.out.println(countries.size());

    }

}
