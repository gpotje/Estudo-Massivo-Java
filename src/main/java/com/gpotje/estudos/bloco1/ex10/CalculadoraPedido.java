package com.gpotje.estudos.bloco1.ex10;

import com.gpotje.estudos.bloco1.ex7.Pedido;

public class CalculadoraPedido {
    public Double calculaPedido(Pedido pedido){
        return pedido.calcularTotal();
    }
}
