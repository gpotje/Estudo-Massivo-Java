package com.gpotje.estudos.bloco1.ex11;

import com.gpotje.estudos.bloco1.ex7.Pedido;

public class PedidoRepositoryBanco implements PedidoRepository{
    @Override
    public void salvar(Pedido p) {
        System.out.println("Salva pedido no banco");
    }
}
