package com.gpotje.estudos.bloco1.ex14;

public class CargoQA implements Cargo{
    @Override
    public double calcular(double salarioBase) {
        return salarioBase + (salarioBase * 0.10);
    }
}
