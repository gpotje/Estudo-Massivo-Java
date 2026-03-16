package com.gpotje.estudos.bloco1.ex11;

import com.gpotje.estudos.bloco1.ex10.EmailService;
import com.gpotje.estudos.bloco1.ex10.PedidoRepository;
import com.gpotje.estudos.bloco1.ex7.Pedido;

public class PedidoServiceInicial {

    private PedidoRepository repository =  new PedidoRepository();
    private EmailService emailService =  new EmailService();

    public void finalizaPedido(Pedido pedido){
        repository.salvar(pedido);
        emailService.enviarConfirmacao(pedido);
    }

}
