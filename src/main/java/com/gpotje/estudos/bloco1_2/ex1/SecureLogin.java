package com.gpotje.estudos.bloco1_2.ex1;

public class SecureLogin extends Auth{
    @Override
    protected void auth2fa(){
        System.out.println("Validating 2FA Secure Login...");
    }
}
