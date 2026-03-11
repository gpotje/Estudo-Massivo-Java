package com.gpotje.estudos.bloco1.ex6;

import com.gpotje.estudos.bloco1.ex4.Produto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();
    private List<RegraDesconto> descontos;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Carrinho(List<RegraDesconto> desconto) {
        this.descontos = desconto;
    }

    public double calcularTotal() {
        double total = 0;
        double desconto = 0;
        for (Produto p : produtos) {
            System.out.println(p.toString());
            total += p.getValor();
        }
        for (RegraDesconto d : descontos) {
            desconto += d.aplicar(total);
        }
        System.out.println("O valor total da compra R$:"+total);
        System.out.println("Parabens vc teve R$:"+desconto +" de desconto");
        return total - desconto;
    }

}
