package com.notificationSystem.CompositionVersion;

public class Logger implements Notifier{
    //Logger has a notifier
    Notifier notifier;

    public Logger(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        System.out.println("Logging: Messaged logged successfully "+ message);
        notifier.send(message);
    }
}
