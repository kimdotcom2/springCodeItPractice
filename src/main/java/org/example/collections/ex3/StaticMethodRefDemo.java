package org.example.collections.ex3;

import java.util.function.Function;

@FunctionalInterface
interface MyFunction  {
    Person apply(Integer x);
}

class Person {
    int age;

    public Person(Integer age) {
        this.age = age;
    }
}

public class StaticMethodRefDemo {

    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {

        //MyFunction myFunction = StaticMethodRefDemo::doubleValue;

        //System.out.println(myFunction.apply(10));

        MyFunction myFunction = Person::new;

        myFunction.apply(10);

    }

}
