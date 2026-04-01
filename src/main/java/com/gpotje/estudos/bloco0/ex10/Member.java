package com.gpotje.estudos.bloco0.ex10;

public class Member extends Discount{
    @Override
    protected double calculatePrice(double price) {
        return price * 0.8;
    }
}
