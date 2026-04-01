package com.gpotje.estudos.bloco0.ex10;

public class Seasonal extends Discount{
    @Override
    protected double calculatePrice(double price) {
        return price * 0.9;
    }
}
