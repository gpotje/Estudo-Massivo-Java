package com.gpotje.estudos.bloco1_1.ex4;

abstract class Ticket {
    protected double basePrice;

    public Ticket(double basePrice){
        this.basePrice = basePrice;
    }

    public void buy(){
        double fee = calculateDiscount();
        double total =  basePrice + fee;
        System.out.println("Total: " + total);
    }

    protected abstract double calculateDiscount();
}
