package com.gpotje.estudos.bloco1.ex5;

import com.gpotje.estudos.bloco1.ex4.Produto;

public class Principal {

    public static void main(String[] args) {
        RegraDesconto regra = new DescontoCarrinhoGrande();

        Produto p1 = new Produto("Radio",100.0);
        Produto p2 = new Produto("TV",1000.0);

        Carrinho carrinho = new Carrinho(regra);
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        System.out.println("Total: "+carrinho.calcularTotal());

    }
}
