package com.gpotje.estudos.bloco1.ex15;

public class Principal {
    public static void main(String[] args) {
        Pedido15 p15 =  new Pedido15(1000.0);

        Desconto dComum = new DescontoClienteComum();
        Desconto dVip = new DescontoClienteVip();
        Desconto dFuncionario =  new DescontoFuncionario();

        System.out.println("Desconto comum "+dComum.calcular(p15));
        System.out.println("Desconto vip "+dVip.calcular(p15));
        System.out.println("Desconto funcionario "+dFuncionario.calcular(p15));

    }
}
