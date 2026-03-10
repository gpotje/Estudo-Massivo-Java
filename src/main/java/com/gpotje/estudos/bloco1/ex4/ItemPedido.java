package com.gpotje.estudos.bloco1.ex4;

public class ItemPedido {

    private Produto produto;
    private Integer quantidade;

    public ItemPedido(Produto produto, Integer quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public double calcularSubtotal(){
        return produto.getValor() * quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
