package com.gpotje.estudos.bloco1.ex8;

abstract  class Funcionario {
     Double salario;
     String nome;

    abstract Double calcularBonus();

    @Override
    public String toString() {
        return getClass().getSimpleName() +": "+ nome +" / "+ "Salario R$: " + salario;
    }
}
