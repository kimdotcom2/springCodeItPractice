package org.example.objectorientedprogramming.ex6;

public class AnonymousClassExample {

    public static void main(String[] args) {

        EventListener listener = new EventListener() {
            @Override
            public void onEvent(String eventData) {
                System.out.println("Event Data: " + eventData);
            }
        };

        for (int i = 0; i < 10; i++) {
            simulateEvent("Event Data: " + i, listener);
        }

    }

    public static void simulateEvent(String eventData, EventListener listener) {
        listener.onEvent(eventData);
    }
}
