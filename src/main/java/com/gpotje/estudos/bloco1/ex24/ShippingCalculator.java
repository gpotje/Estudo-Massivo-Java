package com.gpotje.estudos.bloco1.ex24;

public class ShippingCalculator {

    private ShippingRule rules;

    public ShippingCalculator(ShippingRule rules) {
        this.rules = rules;
    }

    public double calculate(Order order){
        if (rules.appliesTo(order)){
            return rules.calculate(order);
        }
        throw new RuntimeException("No rule found");
    }

}
