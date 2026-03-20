package com.gpotje.estudos.bloco1.ex19;

public class PedidoInicial {
    double valor;
    boolean clienteVip;

    public PedidoInicial(double valor, boolean clienteVip) {
        this.valor = valor;
        this.clienteVip = clienteVip;
    }
}
class PedidoService {

    public double calcularFrete(PedidoInicial pedido) {

        if (pedido.clienteVip) {
            return 0;
        }

        if (pedido.valor > 200) {
            return 0;
        }

        return 20;
    }
}