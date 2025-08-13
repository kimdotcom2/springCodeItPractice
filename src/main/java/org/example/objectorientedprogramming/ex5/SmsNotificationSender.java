package org.example.objectorientedprogramming.ex5;

public class SmsNotificationSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("SMS 전송: " + message);
    }
}
