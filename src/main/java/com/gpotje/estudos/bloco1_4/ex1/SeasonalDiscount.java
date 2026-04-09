package com.gpotje.estudos.bloco1_4;

public class SeasonalDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}
