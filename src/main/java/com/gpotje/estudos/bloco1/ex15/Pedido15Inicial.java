package com.gpotje.estudos.bloco1.ex15;

public class Pedido15Inicial {
    private double valor;

    public Pedido15Inicial(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class CalcularaDesconto{

    public double calcular(Pedido15Inicial p15 ,String tipoCliente){
        if(tipoCliente.equals("COMUM")){
            return p15.getValor() *  0.05;
        }
        if(tipoCliente.equals("VIP")){
            return p15.getValor() * 0.10;
        }
        if(tipoCliente.equals("FUNCIONARIO")){
            return p15.getValor() * 0.20;
        }
        return 0;
    }

}