package com.gpotje.estudos.bloco1_1.ex3;

public class Basic extends Subscription{

    public Basic(double monthlyFee) {
        super(monthlyFee);
    }

    @Override
    protected double calculatePay() {
        return 0;
    }
}
