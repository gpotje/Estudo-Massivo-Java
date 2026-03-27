package com.gpotje.estudos.bloco0.ex1;

public class PixPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying with PIX");
    }
}
