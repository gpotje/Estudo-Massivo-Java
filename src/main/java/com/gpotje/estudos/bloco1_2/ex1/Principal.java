package com.gpotje.estudos.bloco1_2.ex1;

public class Principal {
    public static void main(String[] args) {
        Auth basicLogin = new BasicLogin();
        Auth secureLogin = new SecureLogin();

        LoginService service = new LoginService();
        service.login(basicLogin);
        System.out.println();
        service.login(secureLogin);

    }
}
