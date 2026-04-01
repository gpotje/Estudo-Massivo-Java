package com.gpotje.estudos.bloco0.ex8;

public class Pac extends Shipping{
    @Override
    protected double calculateFee(double amount) {
        return amount * 0.05;
    }
}
