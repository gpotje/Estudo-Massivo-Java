package com.gpotje.estudos.bloco1.ex19;

public class Pedido {
    private double valor;
    private boolean clienteVip;

    public Pedido(double valor, boolean clienteVip) {
        this.valor = valor;
        this.clienteVip = clienteVip;
    }

    public double getValor() {
        return valor;
    }

    public boolean isClienteVip() {
        return clienteVip;
    }

    public double calcularFrete(){
        if(clienteVip) return 0;
        if(valor > 200) return 0;
        return 20;
    }
}
