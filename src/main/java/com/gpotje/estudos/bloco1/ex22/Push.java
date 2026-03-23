package com.gpotje.estudos.bloco1.ex22;

public class Push implements Notification{
    @Override
    public void send(NotificationDispatcher message) {
        System.out.println("Sending push notification to " + message.getRecipient());
    }
}
