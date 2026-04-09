package com.gpotje.estudos.bloco1_4;

public class NoDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return 0.0;
    }
}
