package com.gpotje.estudos.bloco1.ex24;

public class Pricipal {
    public static void main(String[] args) {
        ShippingRule up10 = new UpTo10kg();

        Order order =  new Order(10);

        ShippingCalculator sc = new ShippingCalculator(up10);
        System.out.println(sc.calculate(order));

    }
}
