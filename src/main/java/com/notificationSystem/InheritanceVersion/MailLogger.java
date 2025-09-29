package com.notificationSystem.InheritanceVersion;

public class MailLogger extends Notifier{
    @Override
    public void send(String message) {
        System.out.println("Message Logged successfully in Mail");
        super.send(message);
    }


}