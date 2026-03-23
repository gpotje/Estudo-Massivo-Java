package com.gpotje.estudos.bloco1.ex21;

import java.util.List;

public class Pedido {

    double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public double totalDescontos(List<Desconto> descontoList) {

        double desconto = 0;

        for(Desconto d : descontoList){
            desconto += d.calcular(this);
        }

        return valor - desconto;
    }
}
