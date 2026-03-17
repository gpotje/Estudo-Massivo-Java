package com.gpotje.estudos.bloco1.ex13;

public class ProdutoEx13 {
    private String nome;
    private double preco;
    private boolean promocao;

    public ProdutoEx13(String nome, boolean promocao, double preco) {
        this.nome = nome;
        this.promocao = promocao;
        this.preco = preco;
    }

    public double calcularPreco() {
        return promocao ? preco * 0.9 : preco;
    }

    @Override
    public String toString() {
        return "Produto " +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", promocao=" + promocao;
    }
}
