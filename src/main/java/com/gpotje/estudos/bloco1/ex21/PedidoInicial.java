package com.gpotje.estudos.bloco1.ex21;

public class PedidoInicial {
    double valor;
    boolean clienteVip;
    boolean cupom;

    public PedidoInicial(double valor, boolean clienteVip, boolean cupom) {
        this.valor = valor;
        this.clienteVip = clienteVip;
        this.cupom = cupom;
    }
}
class DescontoServiceInicial {

    public double calcular(PedidoInicial pedido) {

        double desconto = 0;

        if (pedido.clienteVip) {
            desconto += pedido.valor * 0.10;
        }

        if (pedido.cupom) {
            desconto += pedido.valor * 0.05;
        }

        return desconto;
    }
}
