package org.example.collections.ex3;

class Greeter {
    private final String prefix = "";

    public Greeter(String prefix) {
        //this.prefix = prefix;
    }

    public void greet(String name) { // 메서드 여러개 가능
        System.out.println(prefix + " " + name);
    }
}

@FunctionalInterface
interface StringAction {

    void run(String input);

    default void info() {
        System.out.println("[Info] StringAction default method");
    }
    static void help() {
        System.out.println("[Help] This is a helper.");
    }
}

interface Broken {
    void a();
    void b();
}

public class FunctionalVsClass {

    public static void main(String[] args) {

        Greeter greeter = new Greeter("Hello");
        greeter.greet("Kim");

        StringAction printUpper1 = new StringAction() {
            @Override
            public void run(String input) {
                System.out.println(input.toUpperCase());
            }
        };

        StringAction printUpper2 = s -> System.out.println(s.toUpperCase());

        printUpper1.run("hello");
        printUpper2.run("world");
    }

}
