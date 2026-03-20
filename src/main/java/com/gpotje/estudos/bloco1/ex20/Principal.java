package com.gpotje.estudos.bloco1.ex20;

public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(true);
        Pedido p1 = new Pedido(1000.0,c1);
        System.out.println(p1.calcularDesconto());
    }
}
