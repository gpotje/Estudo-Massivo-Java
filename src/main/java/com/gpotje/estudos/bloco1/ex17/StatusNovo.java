package com.gpotje.estudos.bloco1.ex17;

public class StatusNovo implements StatusPedido{
    @Override
    public void avancar(Pedido pedido) {
        pedido.setStatus(new StatusPago());
    }
}
