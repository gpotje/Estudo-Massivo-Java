package com.gpotje.estudos.bloco1.ex10;

import com.gpotje.estudos.bloco1.ex7.ItemPedido;
import com.gpotje.estudos.bloco1.ex7.Pedido;
import org.springframework.stereotype.Repository;

public class PedidoService {

    private CalculadoraPedido cal;
    private PedidoRepository repository;
    private EmailService emailService;

    public PedidoService(CalculadoraPedido cal, EmailService emailService, PedidoRepository repository) {
        this.cal = cal;
        this.emailService = emailService;
        this.repository = repository;
    }

    public void finalizarPedido(Pedido pedido) {

        double total = cal.calculaPedido(pedido);

        System.out.println("Total do pedido: " + total);

        repository.salvar(pedido);
        emailService.enviarConfirmacao(pedido);

        System.out.println("Pedido finalizado.... ");
    }
}
