package com.gpotje.estudos.bloco0.ex8;

public class Pickup extends Shipping{
    @Override
    protected double calculateFee(double amount) {
        return 0;
    }
}
