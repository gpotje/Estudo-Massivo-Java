package com.gpotje.estudos.bloco1_3.ex4.ex3;

public class Principal {
    public static void main(String[] args) {
        Notification email = new Email();
        Notification sms = new Sms();

        NotificationService service = new NotificationService();
        service.send(email,"TESTE EMAIL");
        service.send(sms,"TESTE SMS");

    }
}
