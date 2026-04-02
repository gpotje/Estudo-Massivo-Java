package com.gpotje.estudos.bloco1_1.ex1;

abstract class Order {

    protected double price;

    public Order(double price){
        this.price = price;
    }

    public void checkout(){
        double total = calculateFee();
        System.out.println("Total: " + total);
    }

    abstract protected double calculateFee();

}
