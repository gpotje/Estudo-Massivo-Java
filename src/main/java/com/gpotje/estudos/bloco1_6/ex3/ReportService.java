package com.gpotje.estudos.bloco1_6.ex3;

public class ReportService {
    private File file;

    public ReportService(File file){
        this.file = file;
    }

    public void generate() {
        System.out.println("Generating report...");
        file.generate();
        log();
    }

    protected void log(){
        // hook vazio
    }
}
