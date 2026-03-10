package com.gpotje.estudos.bloco1.ex4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Double desconto;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Double desconto){
        this.desconto = desconto;
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public double calcularTotal() {
        Double soma = 0.0;

        for(ItemPedido item : itens){
                soma += item.calcularSubtotal();
            }

        return soma - this.desconto;
    }

}
