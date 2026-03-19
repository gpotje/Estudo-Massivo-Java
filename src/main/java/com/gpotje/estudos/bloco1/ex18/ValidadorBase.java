package com.gpotje.estudos.bloco1.ex18;

public abstract class ValidadorBase implements ValidadorPedido{
    private ValidadorPedido proximo;

    public ValidadorBase(ValidadorPedido proximo) {
        this.proximo = proximo;
    }

    protected void validarProximo(Pedido pedido) {
        if (proximo != null) {
            proximo.validar(pedido);
        }
    }
}
