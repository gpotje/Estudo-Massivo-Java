package com.gpotje.estudos.bloco1.ex24;

public class UpTo10kg implements ShippingRule{
    @Override
    public boolean appliesTo(Order order) {
        return order.getWeight() <= 10;
    }

    @Override
    public double calculate(Order order) {
        return 10;
    }
}
