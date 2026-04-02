package com.gpotje.estudos.bloco1_1.ex2;

abstract class Product {
    protected double price;
    protected String name;

    public Product(double price, String name){
        this.name = name;
        this.price = price;
    }

    public void checkout(){
        double fee = calculateFee();
        double total = price + fee;
        System.out.println("Total: " + total);
    }
    abstract protected double calculateFee();
}
