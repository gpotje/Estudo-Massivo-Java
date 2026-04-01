package com.gpotje.estudos.bloco0.ex10;

abstract class Discount {

    public void apply(double price){
        double finalPrice = calculatePrice(price);
        System.out.println("Final price: "+ finalPrice);
    }
    protected abstract double calculatePrice(double price);
}
