package com.gpotje.estudos.bloco1.ex18;

public class Pedido {
    private double valor;
    private String cliente;
    private boolean ativo;

    public double getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Pedido(double valor, String cliente, boolean ativo) {
        this.valor = valor;
        this.cliente = cliente;
        this.ativo = ativo;

    }
}
