package com.gpotje.estudos.bloco1_5.ex2;

public class Principal {
    public static void main(String[] args) {
        Tax brt = new BrazilTax();
        Tax ust = new USTax();

        TaxService service = new TaxService();
        System.out.println(service.calculate(brt,1000.0));
        System.out.println(service.calculate(ust,1000.0));
    }
}
