package com.gpotje.estudos.bloco1_4.ex1;

public class PaymentProcessor {
    private Discount discount;

    public PaymentProcessor(Discount discount){
        this.discount = discount;
    }

    public void pay(double price){
        double discountFinal = discount.calculate(price);
        double total = price - discountFinal;
        System.out.println("Paid: " + total);
    }
}
