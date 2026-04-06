package com.gpotje.estudos.bloco1_1.ex3;

abstract class Subscription {
    protected double monthlyFee;

    public Subscription(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }

    public void pay(){
        double fee = calculatePay();
        double total = monthlyFee - fee;
        System.out.println("Paid: " + total);
    }


    protected abstract double calculatePay();
}
