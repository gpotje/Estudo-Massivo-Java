package com.gpotje.estudos.bloco1.ex22;

public class Sms implements Notification{
    @Override
    public void send(NotificationDispatcher message) {
        System.out.println("Sending SMS to " + message.getRecipient());
    }
}
