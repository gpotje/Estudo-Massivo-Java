package com.gpotje.estudos.bloco1.ex5;

public class DescontoCarrinhoGrande  implements RegraDesconto{
    @Override
    public double aplicar(double total) {
        if(total > 500)
            total = total * 0.10;

        return total;
    }
}
