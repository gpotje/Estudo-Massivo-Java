package com.gpotje.estudos.bloco1_2.ex2;

abstract class BaseDelivery {

    public void deliver(){
        System.out.println("Preparing delivery...");
        System.out.println("Sending...");
        confirmationDelivery();
        System.out.println("Delivered");
    }

    protected void confirmationDelivery(){

    }
}
