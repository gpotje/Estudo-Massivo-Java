package com.gpotje.estudos.bloco1.ex12;

public class UsuarioValidator {
    public void validaUsuario(UsuarioDto dto){
        if(dto.isAtivo()){
            System.out.println("Usuario ok");
        }else{
            throw new RuntimeException("Usuario bloqueado");
        }
    }
}
