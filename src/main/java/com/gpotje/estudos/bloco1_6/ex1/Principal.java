package com.gpotje.estudos.bloco1_6.ex1;

public class Principal {
    public static void main(String[] args) {
        Discount basicDiscount = new BasicDiscount();
        Payment debit = new Debit();
        Shipping express = new Express();

        CheckoutService service = new CheckoutService(basicDiscount,debit,express);
        service.checkout(1000.0);
    }
}
