package com.gpotje.estudos.bloco1.ex11;

import com.gpotje.estudos.bloco1.ex7.Pedido;

public class EmailServiceSMTP implements EmailService{
    @Override
    public void enviarConfirmacao(Pedido p) {
        System.out.println("Envia Email de confirmação");
    }
}
