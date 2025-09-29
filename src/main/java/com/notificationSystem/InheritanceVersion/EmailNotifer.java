package com.notificationSystem.InheritanceVersion;

public class EmailNotifer extends Notifier{
    @Override
    public void send(String message) {
        System.out.println("Message sent successfully via Email");
    }
}
