package com.gpotje.estudos.bloco1.ex20;

public class PedidoInicial {
    double valor;
    ClienteInicial cliente;

    public PedidoInicial(double valor, ClienteInicial cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }
}
class ClienteInicial {

    boolean vip;

    public ClienteInicial(boolean vip) {
        this.vip = vip;
    }
}
class DescontoService {

    public double calcularDesconto(PedidoInicial pedido) {

        if (pedido.cliente.vip) {
            return pedido.valor * 0.10;
        }

        return 0;
    }
}
