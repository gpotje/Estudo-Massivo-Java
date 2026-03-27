package com.gpotje.estudos.bloco0.ex1;

public class Principal {
    public static void main(String[] args) {
        Payment pix = new PixPayment();
        Payment credit = new CreditPayment();

        pix.pay();
        credit.pay();
    }
}
