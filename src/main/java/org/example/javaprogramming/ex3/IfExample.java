package org.example.javaprogramming.ex3;

public class IfExample {

    public static void main(String[] args) {

        int score = 77;

        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        } else {
            System.out.println("F 재수강");
        }

    }

}
