package com.gpotje.estudos.bloco1.ex9;

public class Principal {
    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();
        service.gerar(new RelatorioPDF());
        service.gerar(new RelatorioHTML());
        service.gerar(new RelatorioCSV());
    }
}
