package org.example.objectorientedprogramming.ex6;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        AbstractTask task = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("Task Executed");
            }
        };

        task.execute();
        task.onEvent("Event Data");

    }

}
