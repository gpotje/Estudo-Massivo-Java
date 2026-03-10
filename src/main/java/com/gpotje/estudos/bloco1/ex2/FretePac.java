package com.gpotje.estudos.bloco1.ex2;

public class FretePac implements Frete {

    @Override
    public double calcular(double peso) {
        return peso * 1.2;
    }
}
