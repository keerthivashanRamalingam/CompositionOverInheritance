package com.notificationSystem.InheritanceVersion;

public class SmsNotifier extends Notifier{
    @Override
    public void send(String message) {
        System.out.println("Message sent successfully via SMS");
    }
}
