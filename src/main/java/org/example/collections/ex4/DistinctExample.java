package org.example.collections.ex4;

import java.util.List;

class Person {
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;
}

public class DistinctExample {

    public static void main(String[] args) {

        List<Person> list = List.of(new Person("ba", 10), new Person("ba", 10));

        list.stream()
            .distinct()
            .forEach(System.out::println);

    }

}
