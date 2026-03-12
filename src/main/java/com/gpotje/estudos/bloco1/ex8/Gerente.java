package com.gpotje.estudos.bloco1.ex8;

public class Gerente extends Funcionario {

    @Override
    public Double calcularBonus() {
        return this.salario * 0.20;
    }

    public Gerente( String nome,Double salario) {
        this.salario = salario;
        this.nome = nome;
    }
}
