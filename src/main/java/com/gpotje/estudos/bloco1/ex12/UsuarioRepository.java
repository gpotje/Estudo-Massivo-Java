package com.gpotje.estudos.bloco1.ex12;

public class UsuarioRepository {
    public  void salvaUsuario(UsuarioDto dto){
        System.out.println("Salvando no banco usuario: "+dto.getEmail());
    }
}
