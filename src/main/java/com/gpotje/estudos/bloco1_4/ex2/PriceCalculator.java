package com.gpotje.estudos.bloco1_4.ex2;

public class PriceCalculator {
    private Shipping shipping;
    private Discount discount;

    public PriceCalculator(Shipping shipping, Discount discount){
        this.shipping = shipping;
        this.discount = discount;
    }

    public double calculate(double price){
        double total = price ;
        total -= discount.discountType(price);
        total += shipping.shippingType();
        return  total ;
    }
}
