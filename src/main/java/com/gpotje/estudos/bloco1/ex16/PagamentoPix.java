package com.gpotje.estudos.bloco1.ex16;

public class PagamentoPix implements PagamentoStrategy{
    @Override
    public double calcularTotal(Pedido pedido) {
        return pedido.getValor() - (pedido.getValor() * 0.03);
    }
}
