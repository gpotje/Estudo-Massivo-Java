package com.gpotje.estudos.bloco1.ex14;

public class CalculadoraSalarioInicial {
    public double calcular(String cargo, double salarioBase) {

        switch (cargo) {

            case "DEV":
                return salarioBase + (salarioBase * 0.20);

            case "QA":
                return salarioBase + (salarioBase * 0.10);

            case "GERENTE":
                return salarioBase + (salarioBase * 0.30);

            default:
                throw new RuntimeException("Cargo inválido");
        }
    }
}
