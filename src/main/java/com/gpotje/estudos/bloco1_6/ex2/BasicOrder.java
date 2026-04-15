package com.gpotje.estudos.bloco1_6.ex2;

public class BasicOrder extends OrderService{
    public BasicOrder(Discount discount, Payment payment, Shipping shipping) {
        super(discount, payment, shipping);
    }
}
