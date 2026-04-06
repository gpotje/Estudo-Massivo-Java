package com.gpotje.estudos.bloco1_1.ex4;

public class Pricipal {
    public static void main(String[] args) {
        Ticket regular = new Regular(1000.0);
        Ticket vip = new Vip(1000.0);

        TicketService service = new TicketService();
        service.buy(regular);
        service.buy(vip);
    }
}
