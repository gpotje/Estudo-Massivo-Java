package com.gpotje.estudos.bloco1.ex23;

public class RegularOrder extends Order{

    public RegularOrder(double total) {
        super(total);
    }

    @Override
    double calculateDiscount() {
        return getTotal() * 0.1;
    }
}
