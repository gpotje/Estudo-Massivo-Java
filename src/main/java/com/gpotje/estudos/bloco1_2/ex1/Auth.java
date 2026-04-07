package com.gpotje.estudos.bloco1_2.ex1;

abstract class Auth {

    public void login(){
        System.out.println("Logging in...");
        System.out.println("Validating user...");
        auth2fa();
        System.out.println("Login success");
    }
    protected void auth2fa(){
        System.out.println("Validating 2FA Padrão...");
    }
}
