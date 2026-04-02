package com.gpotje.estudos.bloco1_1.ex1;

public class Principal {
    public static void main(String[] args) {
        Order express = new Express(1000.0);
        Order normal = new Normal(1000.0);
        Order pickup =  new Pickup(1000.0);

        OrderService service = new OrderService();
        service.checkout(express);
        service.checkout(normal);
        service.checkout(pickup);
    }
}
