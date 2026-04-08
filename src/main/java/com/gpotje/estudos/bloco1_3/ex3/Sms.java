package com.gpotje.estudos.bloco1_3.ex4.ex3;

public class Sms implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
