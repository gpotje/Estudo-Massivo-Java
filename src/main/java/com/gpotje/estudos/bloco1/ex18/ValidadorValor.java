package com.gpotje.estudos.bloco1.ex18;

public class ValidadorValor extends ValidadorBase{
    public ValidadorValor(ValidadorPedido proximo) {
        super(proximo);
        System.out.println("ValidadorValor super");
    }

    @Override
    public void validar(Pedido pedido) {
        if (pedido.getValor() <= 0) {
            throw new RuntimeException("Valor inválido");
        }
        validarProximo(pedido);

    }
}
