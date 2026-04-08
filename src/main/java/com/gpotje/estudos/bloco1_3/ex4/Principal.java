package com.gpotje.estudos.bloco1_3.ex4;

public class Principal {
    public static void main(String[] args) {
        Payment credit = new Credit();
        Payment debit = new Debit();

        PaymentService service = new PaymentService();
        service.pay(credit);
        service.pay(debit);
    }
}
