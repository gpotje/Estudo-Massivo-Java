package com.gpotje.estudos.bloco1.ex12;

public class UsuarioDto {
    private String name;
    private String email;
    private boolean ativo;

    public UsuarioDto(String name, boolean ativo, String email) {
        this.name = name;
        this.ativo = ativo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
