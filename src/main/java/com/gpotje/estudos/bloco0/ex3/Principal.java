package com.gpotje.estudos.bloco0.ex3;

public class Principal {
    public static void main(String[] args) {
        Discount percentage =  new PercentageDiscount(1000.0);
        Discount fixed = new FixedDiscount(1000.0);

        System.out.println(percentage.apply());
        System.out.println(fixed.apply());

    }
}
