package com.gpotje.estudos.bloco1_4.ex2;

public class SeasonalDiscount implements Discount{
    @Override
    public double discountType(double price) {
        return price * 0.9;
    }
}
