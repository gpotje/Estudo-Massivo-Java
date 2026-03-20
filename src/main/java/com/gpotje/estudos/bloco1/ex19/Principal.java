package com.gpotje.estudos.bloco1.ex19;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100.0,false);
        System.out.println(pedido.calcularFrete());
    }
}
