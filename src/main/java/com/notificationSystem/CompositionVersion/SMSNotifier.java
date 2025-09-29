package com.notificationSystem.CompositionVersion;

public class SMSNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Message sent successfully via SMS");
    }
}