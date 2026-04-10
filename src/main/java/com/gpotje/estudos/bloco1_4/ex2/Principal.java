package com.gpotje.estudos.bloco1_4.ex2;

public class Principal {
    public static void main(String[] args) {

        Shipping shippingBasic = new ShippingBasic();
        Shipping shippingExpress = new ShippingExpress();

        Discount withOutDiscount = new WithOutDiscount();
        Discount seasonalDiscount = new SeasonalDiscount();


        PriceCalculator s1 = new PriceCalculator(shippingBasic, withOutDiscount);
        System.out.println(s1.calculate(1000.0));

        PriceCalculator s2 = new PriceCalculator(shippingExpress, seasonalDiscount);
        System.out.println(s2.calculate(1000.0));
    }
}
