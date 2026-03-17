package com.gpotje.estudos.bloco1.ex12;

public class UsuarioService {

    UsuarioRepository repository;
    EmailService email;
    UsuarioValidator validator;

    public UsuarioService(UsuarioRepository repository,EmailService email, UsuarioValidator validator){
        this.repository = repository;
        this.email = email;
        this.validator = validator;
    }

    public void registrarUsuario(UsuarioDto dto) {

        validator.validaUsuario(dto);
        repository.salvaUsuario(dto);
        email.enviaEmail(dto);

    }
}
