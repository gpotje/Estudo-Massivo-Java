package com.gpotje.estudos.bloco1.ex15;

public class DescontoClienteComum implements Desconto{
    @Override
    public double calcular(Pedido15 p15) {
        return p15.getValor() *  0.05;
    }
}
