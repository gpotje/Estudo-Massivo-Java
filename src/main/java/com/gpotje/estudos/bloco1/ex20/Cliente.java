package com.gpotje.estudos.bloco1.ex20;

public class Cliente {
    private boolean vip;

    public Cliente(boolean vip) {
        this.vip = vip;
    }

    public double calcularDesconto(double valor) {
         if (vip) {
            return valor * 0.10;
        }
         return 0;
    }
}
