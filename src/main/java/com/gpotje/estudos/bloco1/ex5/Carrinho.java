package com.gpotje.estudos.bloco1.ex5;

import com.gpotje.estudos.bloco1.ex4.Produto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();
    private RegraDesconto desconto;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Carrinho(RegraDesconto desconto) {
        this.desconto = desconto;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getValor();
        }
        total = desconto.aplicar(total);
        return total;
    }

}
