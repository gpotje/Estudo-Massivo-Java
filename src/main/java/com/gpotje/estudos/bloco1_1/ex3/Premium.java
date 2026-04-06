package com.gpotje.estudos.bloco1_1.ex3;

public class Premium extends Subscription{

    public Premium(double monthlyFee) {
        super(monthlyFee);
    }

    @Override
    protected double calculatePay() {
        return monthlyFee * 0.8;
    }
}
