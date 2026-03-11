package com.gpotje.estudos.bloco1.ex6;

public class DescontoCupom implements RegraDesconto {
    @Override
    public double aplicar(double total) {
        Double desconto = 0.0 ;
        if(total > 100)
            desconto = (total * 0.12);

        return desconto;
    }
}
