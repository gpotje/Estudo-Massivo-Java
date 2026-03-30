package com.gpotje.estudos.bloco0.ex4;

public class SmsMessage implements Message{
    @Override
    public void send(String recipient) {
        System.out.println("Sending SMS: " + recipient);
    }
}

