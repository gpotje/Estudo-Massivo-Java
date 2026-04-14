package com.gpotje.estudos.bloco1_5.ex3;

public class Principal {
    public static void main(String[] args) {
        Filter pf =  new ProfanityFilter();
        Filter sf = new SpamFilter();

        FilterService service = new FilterService();

        service.filter(pf);
        service.filter(sf);
    }
}
