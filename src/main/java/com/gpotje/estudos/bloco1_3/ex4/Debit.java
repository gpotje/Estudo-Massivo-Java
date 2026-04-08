package com.gpotje.estudos.bloco1_3.ex4;

public class Debit extends Payment{
    @Override
    protected void typePayment() {
        System.out.println("Paying with debit");
    }
}
