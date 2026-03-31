package com.gpotje.estudos.bloco0.ex7;

public class Principal {
    public static void main(String[] args) {
        Payment credit = new Credit();
        Payment debit = new Debit();
        Payment pix =  new Pix();

        PaymentService service = new PaymentService();
        service.pay(credit,1000.0);
        service.pay(debit,1000.0);
        service.pay(pix,1000.0);

    }
}
