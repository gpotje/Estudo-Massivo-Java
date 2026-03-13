package com.gpotje.estudos.bloco1.ex7;

public class ItemPedido {

    private Produto1 produto;
    private int quantidade;

    public ItemPedido(Produto1 produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto1 getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularTotal() {
        if(produto.getCategoria().equals("ELETRONICO")) {
            return produto.getPreco() * quantidade * 0.9;
        } else {
            return produto.getPreco() * quantidade;
        }
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
    /*
     public double calcularTotal() {

        double total = 0;
         for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();

            if(produto.getCategoria().equals("ELETRONICO")) {
                total += produto.getPreco() * quantidade * 0.9;
            } else {
                total += produto.getPreco() * quantidade;
            }
        }
        return total;
    }

    */

}
