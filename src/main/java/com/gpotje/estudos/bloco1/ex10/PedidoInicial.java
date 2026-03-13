package com.gpotje.estudos.bloco1.ex10;

import com.gpotje.estudos.bloco1.ex7.Categoria;
import com.gpotje.estudos.bloco1.ex7.ItemPedido;
import com.gpotje.estudos.bloco1.ex7.Pedido;
import com.gpotje.estudos.bloco1.ex7.Produto1;

import java.util.ArrayList;
import java.util.List;

public class PedidoInicial {

    public static void main(String[] args) {

        Produto1 p1 = new Produto1("TV",1000.0, Categoria.ELETROELETRONICO);
        ItemPedido i1 = new ItemPedido(p1, 1);
        List<ItemPedido> li = new ArrayList<>();
        li.add(i1);

        Pedido pedido = new Pedido(li);

        PedidoInicial pi =  new PedidoInicial();
        pi.finalizarPedido(pedido);


    }

    public void finalizarPedido(Pedido pedido) {

        double total = 0;

        for(ItemPedido item : pedido.getItens()) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }

        System.out.println("Total do pedido: " + total);

        System.out.println("Salvando pedido no banco...");

        System.out.println("Enviando email de confirmação...");

    }
}
