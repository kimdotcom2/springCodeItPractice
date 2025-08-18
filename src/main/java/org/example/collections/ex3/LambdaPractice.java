package org.example.collections.ex3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface LengthsChecker {
    void apply(String x);
}

@FunctionalInterface
interface FilterFunction {
    boolean apply(String x);
}

@FunctionalInterface
interface ToUpperFunction {
    String apply(String x);
}

public class LambdaPractice {

    public static void main(String[] args) {

        List<String> names = List.of("apple", "banana", "orange", "grape", "kiwi");

        Consumer<String> print = (String s) -> System.out.println(s);
        LengthsChecker lengthsChecker = (String s) -> System.out.println(s);
        names.forEach(print);
        names.forEach(lengthsChecker::apply);
        System.out.println("=====================");

        Predicate<String> lengthCheck = (String s) -> {
            if (s.length() > 5) {
                return true;
            }
            return false;
        };

        FilterFunction filterfunction = (String s) -> {
            if (s.length() > 5) {
                return true;
            } else {
                return false;
            }
        };

        names.stream().filter(lengthCheck).forEach(System.out::println);
        names.stream().filter(filterfunction::apply).forEach(System.out::println);

        System.out.println("=====================");

        Function<String, String> toUpper = (String s) -> s.toUpperCase();
        ToUpperFunction toUpperFunction = (String s) -> s.toUpperCase();

        names.stream().map(toUpper).forEach(System.out::println);
        names.stream().map(toUpperFunction::apply).forEach(System.out::println);

    }

}
