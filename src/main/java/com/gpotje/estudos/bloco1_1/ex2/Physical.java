package com.gpotje.estudos.bloco1_1.ex2;

public class Physical extends Product{
    public Physical(double price, String name) {
        super(price, name);
    }

    @Override
    protected double calculateFee() {
        return 15;
    }
}
