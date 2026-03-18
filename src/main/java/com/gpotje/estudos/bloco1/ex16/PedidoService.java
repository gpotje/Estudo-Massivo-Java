package com.gpotje.estudos.bloco1.ex16;

public class PedidoService {

    private PagamentoStrategy ps;

    public PedidoService(PagamentoStrategy ps){
        this.ps = ps;
    }

    public double CalculadoraPedido(Pedido p){
        return ps.calcularTotal(p);
    }
}
