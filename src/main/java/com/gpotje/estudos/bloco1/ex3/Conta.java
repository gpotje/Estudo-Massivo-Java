package com.gpotje.estudos.bloco1.ex3;

public class Conta {
    //public double saldo;

    private double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
    public boolean sacar(double valor){
        if(this.saldo > valor){
            saldo = saldo - valor ;
            return true;
        }else
            return false;

    }

}
