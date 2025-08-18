package org.example.collections.ex1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");

        System.out.println(fruits.get(1));

        fruits.remove(1);
        System.out.println(fruits.get(1));

    }

}
