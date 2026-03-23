package com.gpotje.estudos.bloco1.ex21;

public class DescontoVip implements Desconto{
    @Override
    public double calcular(Pedido pedido) {
        return pedido.getValor() * 0.10;
    }
}
