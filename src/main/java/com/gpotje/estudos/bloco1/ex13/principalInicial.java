package com.gpotje.estudos.bloco1.ex13;

public class principalInicial {

    public Double calcularPreco(ProdutoInicial13 p){
        if(p.getPromocao()){
            return p.getPreco() * 0.8;

        }
        return p.getPreco();
    }
}
