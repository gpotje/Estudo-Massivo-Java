package com.gpotje.estudos.bloco1_4.ex2;

public class WithOutDiscount implements Discount{
    @Override
    public double discountType(double price) {
        return 0;
    }
}
