package com.gpotje.estudos.bloco0.ex4;

public class EmailMessage implements Message{
    @Override
    public void send(String recipient) {
        System.out.println("Sending email: " + recipient);
    }
}
