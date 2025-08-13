package org.example.objectorientedprogramming.ex7;

public class EnumBasicTest {

    public enum Level {
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {

        Level level = Level.MEDIUM;
        System.out.println(level);
        System.out.println(level.ordinal());
        System.out.println(level.name());

    }

}
