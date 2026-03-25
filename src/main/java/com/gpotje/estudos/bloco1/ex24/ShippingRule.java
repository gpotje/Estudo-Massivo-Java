package com.gpotje.estudos.bloco1.ex24;

public interface ShippingRule {
    boolean appliesTo(Order order);
    double calculate(Order order);

}
