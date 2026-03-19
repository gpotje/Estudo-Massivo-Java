package com.gpotje.estudos.bloco1.ex18;

public class ValidadorCliente extends ValidadorBase {

    public ValidadorCliente(ValidadorPedido proximo) {
        super(proximo);
        System.out.println("ValidadorCliente super");
    }

    @Override
    public void validar(Pedido pedido) {
        if (pedido.getCliente() == null || pedido.getCliente().isEmpty()) {
            throw new RuntimeException("Cliente inválido");
        }
        validarProximo(pedido);
    }
}
