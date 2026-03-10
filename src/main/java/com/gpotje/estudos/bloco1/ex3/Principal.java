package com.gpotje.estudos.bloco1.ex3;


public class Principal {
    public static void main(String[] args) {
        //        Conta conta = new Conta();
        //        conta.saldo = 1000;
        //
        //        if(conta.saldo >= 200){
        //            conta.saldo -=200;
        //        }

        Conta conta = new Conta(1000);

        if(conta.sacar(100))
            System.out.println("Seu novo saldo é: " + conta.getSaldo());
        else
            System.out.println("O valor desejado é maior que o saldo atual ");
    }
}
