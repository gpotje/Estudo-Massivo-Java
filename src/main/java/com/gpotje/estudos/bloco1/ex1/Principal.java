package com.gpotje.estudos.bloco1.ex1;

public class Principal {
    public static void main(String[] args) {

        Cliente c1 = new ClienteVIP();
        Cliente c2 = new ClienteNormal();

        double c1valorFinal = c1.calcularDesconto(100);
        double c2valorFinal = c2.calcularDesconto(100);

        System.out.println("valor VIP:" + c1valorFinal);
        System.out.println("valor NORMAL:" + c2valorFinal);
    }
}
