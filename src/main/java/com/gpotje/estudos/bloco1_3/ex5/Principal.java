package com.gpotje.estudos.bloco1_3.ex5;

public class Principal {
    public static void main(String[] args) {
        Logger file = new FileLogger();
        Logger db = new DatabaseLogger();

        LogService service = new LogService();
        service.log(file,"TESTE FILE");
        service.log(db,"TESTE DB");
    }
}
