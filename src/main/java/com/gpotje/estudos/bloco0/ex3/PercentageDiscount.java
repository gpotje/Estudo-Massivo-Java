package com.gpotje.estudos.bloco0.ex3;

public class PercentageDiscount extends Discount{

    public PercentageDiscount(double value) {
        super(value);
    }

    double apply() {
        return this.value * 0.9;
    }
}
