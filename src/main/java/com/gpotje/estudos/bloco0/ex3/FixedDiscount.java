package com.gpotje.estudos.bloco0.ex3;

public class FixedDiscount extends Discount{

    public FixedDiscount(double value) {
        super(value);
    }

    @Override
    double apply() {
        return this.value - 50;
    }

}
