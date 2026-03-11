package com.gpotje.estudos.bloco1.ex6;

public class DescontoCarrinhoGrande  implements RegraDesconto {
    @Override
    public double aplicar(double total) {
        Double desconto = 0.0 ;
        if(total > 500)
            desconto = (total * 0.10);

        return desconto;
    }
}
