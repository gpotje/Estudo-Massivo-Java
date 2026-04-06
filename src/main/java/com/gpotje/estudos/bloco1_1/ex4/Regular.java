package com.gpotje.estudos.bloco1_1.ex4;

public class Regular extends Ticket{
    public Regular(double basePrice) {
        super(basePrice);
    }

    @Override
    protected double calculateDiscount() {
        return 0;
    }
}
