package org.example.objectorientedprogramming.ex5;

public class DipTest {

    public static void main(String[] args) {

        NotificationSender[] senders = {new SmsNotificationSender(), new EmailNotificationSender()};
        String[] messages = {"hello", "world"};
        int i = 0;

        for (NotificationSender sender : senders) {

            NotificationService notificationService = new NotificationService(sender);
            notificationService.notify(messages[i++]);

        }

    }

}
