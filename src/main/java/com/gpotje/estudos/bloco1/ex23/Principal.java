package com.gpotje.estudos.bloco1.ex23;

public class Principal {
    public static void main(String[] args) {

        Order ro = new RegularOrder(1000.0);
        Order vo = new VipOrder(1000.0);

        System.out.println(ro.calculateDiscount());
        System.out.println(vo.calculateDiscount());

    }
}
