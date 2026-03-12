package com.gpotje.estudos.bloco1.ex8;

public class Desenvolvedor extends Funcionario  {

    @Override
    public Double calcularBonus() {
        return this.salario * 0.10;
    }

    public Desenvolvedor(String nome, Double salario) {
        this.salario = salario;
        this.nome = nome;
    }

}
