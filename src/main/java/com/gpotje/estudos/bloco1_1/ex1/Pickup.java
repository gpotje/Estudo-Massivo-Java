package com.gpotje.estudos.bloco1_1.ex1;

public class Pickup extends Order{
    public Pickup(double price) {
        super(price);
    }

    @Override
    protected double calculateFee() {
        return price;
    }
}
