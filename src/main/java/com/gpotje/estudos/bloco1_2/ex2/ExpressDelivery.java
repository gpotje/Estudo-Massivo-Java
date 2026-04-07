package com.gpotje.estudos.bloco1_2.ex2;

public class ExpressDelivery extends BaseDelivery{
    @Override
    protected void confirmationDelivery(){
        System.out.println("Confirming delivery Express Delivery...");
    }
}
