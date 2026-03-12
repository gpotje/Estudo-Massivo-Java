package com.gpotje.estudos.bloco1.ex8;

public class Principal {
    public static void main(String[] args) {

        Funcionario f1 = new Gerente("Carlos", 10000.0);
        Funcionario f2 = new Desenvolvedor("Ana", 8000.0);
        Funcionario f3 = new Estagiario("Lucas", 2000.0);

        f1.calcularBonus();
       f2.calcularBonus();
        f3.calcularBonus();

        System.out.println(f1.toString());
       System.out.println(f2.toString());
       System.out.println(f3.toString());


    }
}
