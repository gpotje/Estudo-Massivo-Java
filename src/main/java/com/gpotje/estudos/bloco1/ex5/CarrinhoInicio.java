package com.gpotje.estudos.bloco1.ex5;


import com.gpotje.estudos.bloco1.ex4.Produto;

import java.util.ArrayList;
import java.util.List;
/*
Remover a lógica de desconto de dentro do carrinho.
Hoje o carrinho sabe:
somar produtos
aplicar desconto
*/

public class CarrinhoInicio {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public double calcularTotal(){

        double total = 0;

        for(Produto p : produtos){
            total += p.getValor();
        }

        if(total > 500){
            total = total - (total * 0.10);
        }

        return total;
    }


}
