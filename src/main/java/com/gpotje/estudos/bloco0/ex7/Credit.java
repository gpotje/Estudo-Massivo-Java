package com.gpotje.estudos.bloco0.ex7;

public class Credit extends Payment{
    @Override
    protected double calculateFee(double amount) {
        return amount * 0.05;
    }
}
