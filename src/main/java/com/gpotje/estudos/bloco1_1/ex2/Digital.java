package com.gpotje.estudos.bloco1_1.ex2;

public class Digital extends Product{
    public Digital(double price, String name) {
        super(price, name);
    }

    @Override
    protected double calculateFee() {
        return 0;
    }
}
