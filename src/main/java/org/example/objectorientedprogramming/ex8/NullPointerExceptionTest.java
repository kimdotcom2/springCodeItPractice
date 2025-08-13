package org.example.objectorientedprogramming.ex8;

public class NullPointerExceptionTest {

    public static void main(String[] args) {

        printString(null);

    }

    public static void printString(String str) {

        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
            System.out.println(str);
        } finally {
            System.out.println("finally");
        }

    }

}
