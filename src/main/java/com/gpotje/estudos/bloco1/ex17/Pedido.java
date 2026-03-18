package com.gpotje.estudos.bloco1.ex17;

public class Pedido {
    private StatusPedido statusPedido;

    public Pedido(){
        this.statusPedido = new StatusNovo();
    }

    public void setStatus(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void avancarStatus() {
        statusPedido.avancar(this);
    }

    @Override
    public String toString() {
        return "statusPedido = " + statusPedido.getClass().getSimpleName();
    }
}
