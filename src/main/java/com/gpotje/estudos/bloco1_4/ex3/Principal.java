package com.gpotje.estudos.bloco1_4.ex3;

public class Principal {
    public static void main(String[] args) {
        Logger log = new LogFile();
        Sender email = new Email();
        RetryPolicy retryPolicy = new Retry();

        NotificationService service = new NotificationService(log,retryPolicy,email);

        service.send("TESTE");
    }
}
