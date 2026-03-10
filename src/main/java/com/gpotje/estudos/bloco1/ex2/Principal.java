package com.gpotje.estudos.bloco1.ex2;

public class Principal {
    public static void main(String[] args) {
        Frete f1 = new FreteSedex();
        Frete f2 = new FretePac();
        Frete f3 = new FreteRetirada();

        double sedex = f1.calcular(10);
        double pac = f2.calcular(10);
        double retirada = f3.calcular(10);

        System.out.println("SEDEX : "+sedex);
        System.out.println("PAC : "+pac);
        System.out.println("RETIRADA : "+retirada);
    }
}
