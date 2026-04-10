package com.gpotje.estudos.bloco1_4.ex3;

public class Email implements Sender{
    @Override
    public void sendMenssagem(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}
