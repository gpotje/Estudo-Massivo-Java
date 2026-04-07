package com.gpotje.estudos.bloco1_2.ex2;

public class Principal {
    public static void main(String[] args) {
        BaseDelivery standard = new StandardDelivery();
        BaseDelivery express = new ExpressDelivery();

        DeliveryService service = new DeliveryService();
        service.deliver(standard);
        System.out.println();
        service.deliver(express);
    }
}
