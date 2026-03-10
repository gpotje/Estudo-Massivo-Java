package com.gpotje.estudos.bloco1.ex4;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Radio",100.00);

        ItemPedido item  =  new ItemPedido(p1,2);

        Pedido pedido = new Pedido(10.0);
        pedido.adicionarItem(item);

        double total = pedido.calcularTotal();

        System.out.println(item .toString());
        System.out.println("Total: "+total);
    }
}
