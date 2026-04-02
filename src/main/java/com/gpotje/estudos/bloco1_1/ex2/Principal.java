package com.gpotje.estudos.bloco1_1.ex2;

import com.gpotje.estudos.bloco1_1.ex1.OrderService;

public class Principal {
    public static void main(String[] args) {
        Product digital = new Digital(100.0,"windows 11");
        Product physical = new Physical(100.0,"windows 11");

        ProductService service =  new ProductService();
        service.checkout(digital);
        service.checkout(physical);
    }
}
