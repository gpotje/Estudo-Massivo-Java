package com.gpotje.estudos.bloco1.ex2;

public class FreteInicio {

    public double calcular(String tipoFrete, double peso){
        switch (tipoFrete){
            case "SEDEX":
                return peso * 2.0;
            case "PAC":
                return peso * 1.2;
            case "RETIRADA":
                return 0;
            default:
                throw new IllegalArgumentException("Tipo inválido");
        }
    }

    public static void main(String[] args) {

        FreteInicio c = new FreteInicio();
        var resultado = c.calcular("SEDEX",10);

        System.out.println(resultado);

    }
}
