package org.example.objectorientedprogramming.ex6;

public class LocalClassDemo {

    public void executeTask() {

        final int taskId = 999;

        class Localworker {

            public void run() {
                System.out.println("Task ID: " + taskId);
            }

        }

        Localworker localworker = new Localworker();
        localworker.run();

    }

    public static void main(String[] args) {

        LocalClassDemo demo = new LocalClassDemo();
        demo.executeTask();

    }

}
