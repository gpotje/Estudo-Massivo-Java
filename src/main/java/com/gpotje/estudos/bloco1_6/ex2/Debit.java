package com.gpotje.estudos.bloco1_6.ex2;

public class Debit implements Payment{
    @Override
    public void typePayment() {
        System.out.println("Paying with debit");
    }
}
