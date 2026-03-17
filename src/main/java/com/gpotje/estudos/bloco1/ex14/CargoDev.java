package com.gpotje.estudos.bloco1.ex14;

public class CargoDev implements Cargo{
    @Override
    public double calcular(double salarioBase) {
        return salarioBase + (salarioBase * 0.20);
    }
}
