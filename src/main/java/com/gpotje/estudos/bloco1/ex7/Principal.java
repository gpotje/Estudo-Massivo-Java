package com.gpotje.estudos.bloco1.ex7;

public class Principal {
    public static void main(String[] args) {

        Produto1 p1 =  new Produto1("TV",1000.0,Categoria.ELETROELETRONICO);
        Produto1 p2 =  new Produto1("ARMARIO",1000.0,Categoria.MOVEIS);
        ItemPedido i1 = new ItemPedido(p1,1);
        ItemPedido i2 = new ItemPedido(p2,1);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(i1);
        pedido.adicionarItem(i2);

        System.out.println(pedido.calcularTotal());
    }
}
