package com.gpotje.estudos.bloco1_1.ex3;

public class Principal {
    public static void main(String[] args) {
        Subscription basic = new Basic(1000.0);
        Subscription premium = new Premium(1000.0);

        SubscriptionService service = new SubscriptionService();
        service.pay(basic);
        service.pay(premium);
    }
}
