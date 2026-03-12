package com.gpotje.estudos.bloco1.ex8;

public class Estagiario extends Funcionario {

    @Override
    public Double calcularBonus() {
        return this.salario * 0.05;
    }

    public Estagiario(String nome, Double salario) {
        this.salario = salario;
        this.nome = nome;
    }

}
