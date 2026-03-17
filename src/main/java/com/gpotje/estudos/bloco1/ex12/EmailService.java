package com.gpotje.estudos.bloco1.ex12;

public class EmailService {
    public void enviaEmail(UsuarioDto dto){
        System.out.println("Enviando Email para: "+dto.getName() +" Email: "+dto.getEmail());
    }
}
