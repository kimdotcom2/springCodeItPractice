package org.example.objectorientedprogramming.ex6;

public class Main {

    public static void main(String[] args) {

        Outer.StaticInner inner = new Outer.StaticInner();
        inner.printValues();

        Outer.Inner inner2 = new Outer().new Inner();
        inner2.printValues();

    }

}
