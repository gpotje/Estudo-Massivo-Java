package com.gpotje.estudos.bloco1.ex14;

public class Principal {
    public static void main(String[] args) {
        Cargo cargoDev = new CargoDev();
        Cargo cargoQA = new CargoQA();
        Cargo cargoGerente = new CargoGerente();

        System.out.println("Salario DEV: "+cargoDev.calcular(7000.0));
        System.out.println("Salario QA: "+cargoQA.calcular(5000.0));
        System.out.println("Salario Gerente: "+cargoGerente.calcular(12000.0));

    }
}
