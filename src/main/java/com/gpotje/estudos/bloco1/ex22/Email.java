package com.gpotje.estudos.bloco1.ex22;

public class Email implements Notification{
    @Override
    public void send(String recipient) {
        System.out.println("Sending email  notification to " + recipient);
    }
}
