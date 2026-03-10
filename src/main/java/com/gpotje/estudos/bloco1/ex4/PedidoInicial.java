package com.gpotje.estudos.bloco1.ex4;

public class PedidoInicial {

    public double calcularTotal(double valorProduto, int quantidade, double desconto) {
        return (valorProduto * quantidade) - desconto;
    }

    public static void main(String[] args) {
        PedidoInicial incial = new PedidoInicial();
        double total = incial.calcularTotal(100,2,10);
        System.out.println(total);
    }
}
