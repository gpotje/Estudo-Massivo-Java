package com.gpotje.estudos.bloco1_6.ex3;

public class WithLog extends ReportService{
    public WithLog(File file) {
        super(file);
    }
    @Override
    protected void log(){
        System.out.println("Logging...");
    }
}
