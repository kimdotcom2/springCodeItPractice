package org.example.objectorientedprogramming.ex6;

public class Outer {

    private static int staticValue = 100;
    private int instanceValue = 50;

    public static class StaticInner {

        public void printValues() {
            System.out.println("Outer.staticValue: " + staticValue);
        }

    }

    public class Inner {
        public void printValues() {
            System.out.println("Outer.instanceValue: " + instanceValue);
        }
    }

}
