package com.gpotje.estudos.bloco1_1.ex1;

public class Normal extends Order{
    public Normal(double price) {
        super(price);
    }

    @Override
    protected double calculateFee() {
        return price + 10;
    }
}
