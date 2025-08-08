package org.example.javaprogramming.ex3;

public class SwitchExample {

    public static void main(String[] args) {
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            default:
                System.out.println("기타 요일");
        }
    }

}
