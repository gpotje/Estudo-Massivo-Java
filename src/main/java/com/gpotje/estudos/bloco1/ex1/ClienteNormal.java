package com.gpotje.estudos.bloco1.ex1;

public class ClienteNormal implements Cliente {

    public double calcularDesconto(double valorCompra){
        return valorCompra * 0.9;
    }

}
