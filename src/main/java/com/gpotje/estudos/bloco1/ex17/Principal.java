package com.gpotje.estudos.bloco1.ex17;

public class Principal {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        System.out.println("Status Pedido: "+pedido.toString());
        pedido.avancarStatus();
        System.out.println("Status Pedido: "+pedido.toString());
        pedido.avancarStatus();
        System.out.println("Status Pedido: "+pedido.toString());
        pedido.avancarStatus();
        System.out.println("Status Pedido: "+pedido.toString());

    }
}
