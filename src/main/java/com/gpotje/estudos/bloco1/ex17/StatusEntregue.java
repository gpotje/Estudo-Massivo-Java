package com.gpotje.estudos.bloco1.ex17;

public class StatusEntregue implements StatusPedido{
    @Override
    public void avancar(Pedido pedido) {
        throw new RuntimeException("Pedido já foi entregue");
    }
}
