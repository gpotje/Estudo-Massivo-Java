package com.gpotje.estudos.bloco1.ex10;

import com.gpotje.estudos.bloco1.ex7.Categoria;
import com.gpotje.estudos.bloco1.ex7.ItemPedido;
import com.gpotje.estudos.bloco1.ex7.Pedido;
import com.gpotje.estudos.bloco1.ex7.Produto1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        CalculadoraPedido cal = new CalculadoraPedido();
        PedidoRepository repository = new PedidoRepository();
        EmailService emailService = new EmailService();

        Produto1 p1 = new Produto1("TV",1000.0, Categoria.ELETROELETRONICO);
        ItemPedido i1 = new ItemPedido(p1, 1);
        List<ItemPedido> li = new ArrayList<>();
        li.add(i1);

        Pedido pedido = new Pedido(li);

        PedidoService ps =  new PedidoService(cal,emailService,repository);
        ps.finalizarPedido(pedido);
    }
}
