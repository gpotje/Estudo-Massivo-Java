package com.gpotje.estudos.bloco1.ex18;

public class Pedido18Inicial{
    double valor;
    String cliente;
    boolean ativo;

    public Pedido18Inicial(double valor, String cliente, boolean ativo) {
        this.valor = valor;
        this.cliente = cliente;
        this.ativo = ativo;
    }
}
class PedidoValidator {

    public void validar(Pedido18Inicial pedido) {

        if (pedido.cliente == null || pedido.cliente.isEmpty()) {
            throw new RuntimeException("Cliente inválido");
        }

        if (pedido.valor <= 0) {
            throw new RuntimeException("Valor inválido");
        }

        if (!pedido.ativo) {
            throw new RuntimeException("Cliente inativo");
        }

        System.out.println("Pedido válido");
    }
}
