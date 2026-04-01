package com.gpotje.estudos.bloco0.ex8;

public class Principal {
    public static void main(String[] args) {
        Shipping pac = new Pac();
        Shipping pickup = new Pickup();
        Shipping sedex = new Sedex();

        ShippingService service = new ShippingService();
        service.ship(pac,1000.0);
        service.ship(pickup,1000.0);
        service.ship(sedex,1000.0);

    }
}
