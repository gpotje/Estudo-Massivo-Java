package com.gpotje.estudos.bloco1_3.ex4;

abstract class Payment {

    public void pay(){
        System.out.println("Processing payment...");
        typePayment();
    }
    protected abstract void typePayment();
}
