package com.gpotje.estudos.bloco1.ex6;

import com.gpotje.estudos.bloco1.ex4.Produto;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        RegraDesconto r1 = new DescontoCarrinhoGrande();
        RegraDesconto r2 = new DescontoClienteVip();
        RegraDesconto r3 = new DescontoCupom();

        List<RegraDesconto> rd = new ArrayList<>();

        rd.add(r1);
        rd.add(r2);
        rd.add(r3);

        Produto p1 = new Produto("Radio",100.0);
        Produto p2 = new Produto("TV",1000.0);

        Carrinho carrinho = new Carrinho(rd);
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        System.out.println("Total: "+carrinho.calcularTotal());

    }
}
