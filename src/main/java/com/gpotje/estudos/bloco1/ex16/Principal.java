package com.gpotje.estudos.bloco1.ex16;

import com.gpotje.estudos.bloco1.ex15.Pedido15;

public class Principal {
    public static void main(String[] args) {
        Pedido p =  new Pedido(1000.0);
        PagamentoStrategy pc = new PagamentoCredito();
        PedidoService service =  new PedidoService(pc);

        System.out.println("Pagamento Credito "+service.CalculadoraPedido(p));
    }
}
