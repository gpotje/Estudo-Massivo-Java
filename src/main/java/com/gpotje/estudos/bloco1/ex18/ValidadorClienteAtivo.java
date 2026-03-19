package com.gpotje.estudos.bloco1.ex18;

public class ValidadorClienteAtivo extends ValidadorBase{

    public ValidadorClienteAtivo(ValidadorPedido proximo) {
        super(proximo);
        System.out.println("ValidadorClienteAtivo super");
    }

    @Override
    public void validar(Pedido pedido) {
        if (!pedido.isAtivo()) {
            throw new RuntimeException("Cliente inativo");
        }

        validarProximo(pedido);
    }
}
