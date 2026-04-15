package com.gpotje.estudos.bloco1_6.ex2;



public class OrderService {

    private Discount discount;
    private Payment payment;
    private Shipping shipping;

    public OrderService(Discount discount, Payment payment, Shipping shipping){
        this.discount = discount;
        this.payment = payment;
        this.shipping = shipping;
    }

    public void process(double price){
        validate(price); // HOOK

        double total = price;
        total -= discount.discount(price);
        total += shipping.typeShipping();

        payment.typePayment();

        System.out.println("Total: " + total);
    }

    protected void validate(double price){
        // hook vazio
    }
}
