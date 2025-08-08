package org.example.javaprogramming.ex1;

public class Main {

    public static void main(String[] args) {

        int a = 1000, b = 2000;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int x = -10, y = 10;

        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x == y);
        System.out.println(x != y);

        boolean t = true, f = false;

        System.out.println(t && f);
        System.out.println(t || f);
        System.out.println(!t);

        int num = 10;

        num += 5;
        num *= 4;

        int score = 100;
        String result = (score >= 90) ? "A학점" : "B학점";

        System.out.println("결과: " + result);

    }

}
