package com.gpotje.estudos.bloco1.ex4;

public class Produto {

    private String nome;
    private Double valor;

    public Produto(String nome, Double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
