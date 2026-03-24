package com.gpotje.estudos.bloco1.ex23;

public abstract class Order {
    private double total;

    public Order(double total) {
        this.total = total;
    }

    protected double getTotal() {
        return total;
    }

    abstract  double calculateDiscount();

}
