package com.gpotje.estudos.bloco1_1.ex4;

public class Vip extends Ticket{
    public Vip(double basePrice) {
        super(basePrice);
    }

    @Override
    protected double calculateDiscount() {
        return 50;
    }
}
