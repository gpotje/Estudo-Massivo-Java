package com.gpotje.estudos.bloco1.ex23;

public class OrderServiceInicial {

    public double calculateDiscount(OrderInicial order){

        if(order.getTotal() > 1000){
            return order.getTotal() * 0.1;
        }
        return  0.0;
    }
}

class OrderInicial{
    private double total;

    public OrderInicial(double total) {
        this.total = total;
    }

    public double getTotal(){
        return total;
    }
}
