package com.gpotje.estudos.bloco1.ex6;

public class DescontoClienteVip implements RegraDesconto {
    @Override
    public double aplicar(double total) {
        Double desconto = 0.0 ;
        if(total > 300)
            desconto = (total * 0.15);

        return desconto;
    }
}
