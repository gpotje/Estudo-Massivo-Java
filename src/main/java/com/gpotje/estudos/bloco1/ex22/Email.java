package com.gpotje.estudos.bloco1.ex22;

public class Email implements Notification{
    @Override
    public void send(NotificationDispatcher message) {
        System.out.println("Sending email to " + message.getRecipient());
    }
}
