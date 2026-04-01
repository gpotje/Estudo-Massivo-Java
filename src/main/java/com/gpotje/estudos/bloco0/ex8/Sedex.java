package com.gpotje.estudos.bloco0.ex8;

public class Sedex extends Shipping{
    @Override
    protected double calculateFee(double amount) {
        return amount * 0.10;
    }
}
