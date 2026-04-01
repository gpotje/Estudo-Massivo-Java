package com.gpotje.estudos.bloco0.ex8;

abstract class Shipping {

    public void ship(double amount){
        double fee = calculateFee(amount);
        double total = amount + fee;
        System.out.println("Shipping total: "+total);
    }

    protected abstract double calculateFee(double amount);
}
