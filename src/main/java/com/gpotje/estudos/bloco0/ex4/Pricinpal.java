package com.gpotje.estudos.bloco0.ex4;

public class Pricinpal {
    public static void main(String[] args) {
        Message email =  new EmailMessage();
        Message smsMessage =  new SmsMessage();

        email.send("gabriel@gmail.com");
        smsMessage.send("(11) 99950-5450");
    }
}
