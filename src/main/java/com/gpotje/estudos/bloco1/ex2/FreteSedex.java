package com.gpotje.estudos.bloco1.ex2;

public class FreteSedex implements Frete {

    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }
}
