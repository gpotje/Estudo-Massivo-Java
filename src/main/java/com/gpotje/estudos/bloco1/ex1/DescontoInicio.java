package com.gpotje.estudos.bloco1.ex1;

public class DescontoInicio {

    
    public static double calcularDesconto(String tipoCliente, double valorCompra){
        if(tipoCliente.equals("VIP")){
            return valorCompra * 0.8;
        }

        if(tipoCliente.equals("NORMAL")){
            return valorCompra * 0.9;
            
        }

        return 0d;
    }

     public static void main(String[] args) {
        
        double valorFinal = DescontoInicio.calcularDesconto("VIP", 100);

        System.out.println(valorFinal);
        
    }

}
