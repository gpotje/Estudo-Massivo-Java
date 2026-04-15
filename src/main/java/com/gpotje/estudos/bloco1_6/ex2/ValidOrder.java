package com.gpotje.estudos.bloco1_6.ex2;

public class ValidOrder extends OrderService{
    public ValidOrder(Discount discount, Payment payment, Shipping shipping) {
        super(discount, payment, shipping);
    }
    @Override
    protected void validate(double price){
        System.out.println("Validating price...");
    }
}
