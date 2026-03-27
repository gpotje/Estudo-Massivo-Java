package com.gpotje.estudos.bloco0.ex3;

abstract class Discount {
    protected double value;

    public Discount(double value) {
        this.value = value;
    }

    abstract double apply();
}
