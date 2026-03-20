package com.gpotje.estudos.bloco1.ex20;

public class Pedido {
    private double valor;
    private Cliente cliente;

    public Pedido(double valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public double calcularDesconto(){
        return cliente.calcularDesconto(valor);
    }
}
