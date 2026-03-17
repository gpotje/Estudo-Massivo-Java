package com.gpotje.estudos.bloco1.ex13;

public class Principal {
    public static void main(String[] args) {
        ProdutoEx13 tv = new ProdutoEx13("TV",true,1000.0);
        ProdutoEx13 geladeira = new ProdutoEx13("Geladeira",true,2000.0);

        double descontoTV = tv.calcularPreco();
        System.out.println(tv.toString());
        System.out.println("desconto TV: "+descontoTV);

        System.out.println("===================");

        double descontoGeladeira = geladeira.calcularPreco();
        System.out.println(geladeira.toString());
        System.out.println("desconto Geladeira: "+descontoGeladeira);
    }
}
