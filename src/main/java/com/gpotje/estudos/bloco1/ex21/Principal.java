package com.gpotje.estudos.bloco1.ex21;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Desconto dv = new DescontoVip();
        Desconto dc = new DescontoCupom();

        List<Desconto> desList = new ArrayList<>();
        desList.add(dv);
        desList.add(dc);

        Pedido tv = new Pedido(1000.0);
        tv.totalDescontos(desList);

        System.out.println("Valor Produto: "+tv.getValor());
        System.out.println("Valor final: "+tv.totalDescontos(desList));


    }
}
