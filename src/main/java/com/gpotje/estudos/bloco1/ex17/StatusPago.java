package com.gpotje.estudos.bloco1.ex17;

public class StatusPago implements StatusPedido{
    @Override
    public void avancar(Pedido pedido) {
        pedido.setStatus(new StatusEnviado());
    }
}
