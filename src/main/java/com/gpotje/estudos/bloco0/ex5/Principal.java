package com.gpotje.estudos.bloco0.ex5;

public class Principal {
    public static void main(String[] args) {
        Employe dev = new Developer();
        Employe designer = new Designer();

        dev.work();
        designer.work();
    }
}
