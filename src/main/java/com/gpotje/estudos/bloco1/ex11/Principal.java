package com.gpotje.estudos.bloco1.ex11;

public class Principal {
    public static void main(String[] args) {
        PedidoRepository repository = new PedidoRepositoryBanco();
        EmailService email = new EmailServiceSMTP();

        PedidoService service = new PedidoService(repository, email);
    }
}
