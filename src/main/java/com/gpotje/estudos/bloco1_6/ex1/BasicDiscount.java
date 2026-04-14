package com.gpotje.estudos.bloco1_6.ex1;

public class BasicDiscount implements Discount{
    @Override
    public double discount(double price) {
        return price * 0.9;
    }
}
