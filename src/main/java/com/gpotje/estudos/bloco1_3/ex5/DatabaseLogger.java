package com.gpotje.estudos.bloco1_3.ex5;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String msg) {
        System.out.println("Logging to database: " + msg);
    }
}
