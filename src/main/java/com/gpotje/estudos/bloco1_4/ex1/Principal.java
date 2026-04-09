package com.gpotje.estudos.bloco1_4.ex1;

public class Principal {
    public static void main(String[] args) {

        Discount noDiscount = new NoDiscount();
        Discount seasonDiscount = new SeasonalDiscount();

        PaymentProcessor serviceNoDiscount = new PaymentProcessor(noDiscount);
        serviceNoDiscount.pay(1000.0);

        PaymentProcessor serviceSeasonDiscount = new PaymentProcessor(seasonDiscount);
        serviceSeasonDiscount.pay(1000.0);

    }
}
