package com.gpotje.estudos.bloco0.ex7;

public class Pix extends Payment{
    @Override
    protected double calculateFee(double amount) {
        return 0;
    }
}
