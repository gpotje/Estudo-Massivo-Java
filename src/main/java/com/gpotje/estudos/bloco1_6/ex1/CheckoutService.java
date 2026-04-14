package com.gpotje.estudos.bloco1_6.ex1;

public class CheckoutService {

    private Discount discount;
    private Payment payment;
    private Shipping shipping;

    public CheckoutService(Discount discount,Payment payment,Shipping shipping){
        this.discount = discount;
        this.payment = payment;
        this.shipping = shipping;
    }

    public void checkout(double price){
        double total = price;

        total -= discount.discount(price);
        total += shipping.typeShipping();

        payment.typePayment();

        System.out.println("Total: " + total);
    }
}
