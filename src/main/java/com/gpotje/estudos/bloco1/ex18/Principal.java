package com.gpotje.estudos.bloco1.ex18;

public class Principal {
    public static void main(String[] args) {
        Pedido tv = new Pedido(1200.0,"Gabriel Souza",true);

        ValidadorPedido pipeline = new ValidadorClienteAtivo(new ValidadorValor(new ValidadorCliente(null)));

        //new ValidadorCliente(new ValidadorValor(new ValidadorClienteAtivo(null)));

        pipeline.validar(tv);
        System.out.println("Pedido válido");

    }
}
