package com.gpotje.estudos.bloco1_4.ex3;

public class NotificationService {
    private Logger logger;
    private RetryPolicy retryPolicy;
    private Sender sender;

    public NotificationService(Logger logger,RetryPolicy retryPolicy, Sender sender){
        this.logger = logger;
        this.retryPolicy =  retryPolicy;
        this.sender = sender;
    }

    public void send(String msg){
        sender.sendMenssagem(msg);
        logger.log();
        retryPolicy.retry();
    }
}
