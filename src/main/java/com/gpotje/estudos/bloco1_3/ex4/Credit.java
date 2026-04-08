package com.gpotje.estudos.bloco1_3.ex4;

public class Credit extends Payment{
    @Override
    protected void typePayment() {
        System.out.println("Paying with credit");
    }
}
