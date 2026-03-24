package com.gpotje.estudos.bloco1.ex23;

public class VipOrder extends Order{
    public VipOrder(double total) {
        super(total);
    }

    @Override
    double calculateDiscount() {
        return getTotal() * 0.2;
    }
}
