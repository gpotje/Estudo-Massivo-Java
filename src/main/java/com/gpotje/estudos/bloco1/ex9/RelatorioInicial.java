package com.gpotje.estudos.bloco1.ex9;

public class RelatorioInicial {

    public static void main(String[] args) {

        RelatorioInicial ri =  new RelatorioInicial();
        ri.gerarRelatorio("PDF");
        ri.gerarRelatorio("CSV");
        ri.gerarRelatorio("HTML");
    }

    public void gerarRelatorio(String tipo) {

        if(tipo.equals("PDF")) {
            System.out.println("Gerando relatório em PDF...");
        }

        if(tipo.equals("CSV")) {
            System.out.println("Gerando relatório em CSV...");
        }

        if(tipo.equals("HTML")) {
            System.out.println("Gerando relatório em HTML...");
        }

    }


}
