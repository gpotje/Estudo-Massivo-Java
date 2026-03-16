package com.gpotje.estudos.bloco1.ex11;


import com.gpotje.estudos.bloco1.ex11.PedidoRepository;
import com.gpotje.estudos.bloco1.ex7.Pedido;

public class PedidoService {

    private PedidoRepository repository;
    private EmailService emailService;


    public PedidoService(PedidoRepository repository, EmailService email){
        this.emailService = email;
        this.repository = repository;
    }

    public void finalizarPedido(Pedido p) {
        repository.salvar(p);
        emailService.enviarConfirmacao(p);
    }

}
