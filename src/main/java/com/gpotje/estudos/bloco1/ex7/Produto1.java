package com.gpotje.estudos.bloco1.ex7;

public class Produto1 {

    private String nome;
    private Categoria categoria;
    private double preco;

    public Produto1(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
