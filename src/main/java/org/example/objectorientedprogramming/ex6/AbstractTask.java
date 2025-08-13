package org.example.objectorientedprogramming.ex6;

public abstract class AbstractTask {

    public abstract void execute();

    public void onEvent(String eventData) {
        System.out.println("Event: " + eventData);
    }

}
