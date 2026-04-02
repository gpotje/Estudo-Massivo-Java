package com.gpotje.estudos.bloco1_1.ex1;

public class Express extends Order{
    public Express(double price) {
        super(price);
    }

    @Override
    protected double calculateFee() {
        return price + 20;
    }
}
