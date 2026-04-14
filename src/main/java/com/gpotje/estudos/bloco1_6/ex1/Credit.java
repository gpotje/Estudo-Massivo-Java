package com.gpotje.estudos.bloco1_6.ex1;

public class Credit implements Payment{
    @Override
    public void typePayment() {
        System.out.println("Paying with credit");
    }
}
