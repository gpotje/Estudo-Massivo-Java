package com.gpotje.estudos.bloco0.ex7;

abstract class Payment {

    public void pay(double amount){
        System.out.println("Processing payment...");
        double fee = calculateFee(amount);
        double total = amount + fee;
        System.out.println("Paid: " + total);
    }

    protected abstract double calculateFee(double amount);
}
