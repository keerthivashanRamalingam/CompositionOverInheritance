package com.notificationSystem.InheritanceVersion;

public class SmsLogger extends Notifier {
    @Override
    public void send(String message) {
        System.out.println("Message Logged successfully in SMS");
        super.send(message);
    }
}
