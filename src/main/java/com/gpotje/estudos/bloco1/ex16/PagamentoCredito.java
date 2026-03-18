package com.gpotje.estudos.bloco1.ex16;

public class PagamentoCredito implements PagamentoStrategy{
    @Override
    public double calcularTotal(Pedido pedido) {
        return pedido.getValor() + (pedido.getValor() * 0.05);
    }
}
