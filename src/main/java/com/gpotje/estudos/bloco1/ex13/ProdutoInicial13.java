package com.gpotje.estudos.bloco1.ex13;

public class ProdutoInicial13 {
    private String nome;
    private Double preco;
    private Boolean promocao;

    public Boolean getPromocao() {
        return promocao;
    }

    public Double getPreco() {
        return preco;
    }

    public ProdutoInicial13(String nome, Boolean promocao, Double preco) {
        this.nome = nome;
        this.promocao = promocao;
        this.preco = preco;
    }
}
