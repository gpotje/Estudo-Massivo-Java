package com.gpotje.estudos.bloco1.ex12;

public class Principal {
    public static void main(String[] args) {
        UsuarioRepository repository =  new UsuarioRepository();
        EmailService email = new EmailService();
        UsuarioValidator validator = new UsuarioValidator();

        UsuarioDto dto = new UsuarioDto("Gabriel",false,"gpotje@gmail.com");
        UsuarioService usuarioService = new UsuarioService(repository,email,validator);
        usuarioService.registrarUsuario(dto);
    }
}
