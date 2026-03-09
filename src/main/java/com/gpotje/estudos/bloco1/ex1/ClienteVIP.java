package com.gpotje.estudos.bloco1.ex1;

import com.gpotje.estudos.bloco1.ex1.Cliente;

public class ClienteVIP implements Cliente {

    public double calcularDesconto(double valorCompra){
        return valorCompra * 0.8;
    }

}
