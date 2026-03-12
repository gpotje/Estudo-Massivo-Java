package com.gpotje.estudos.bloco1.ex8;

public class FuncionarioAntes {

    private String nome;
    private String tipo;
    private double salario;

    public FuncionarioAntes(String nome, String tipo, double salario) {
        this.nome = nome;
        this.tipo = tipo;
        this.salario = salario;
    }

    public double calcularBonus() {

        if(tipo.equals("GERENTE")) {
            return salario * 0.20;
        }

        if(tipo.equals("DESENVOLVEDOR")) {
            return salario * 0.10;
        }

        if(tipo.equals("ESTAGIARIO")) {
            return salario * 0.05;
        }

        return 0;
    }

}
