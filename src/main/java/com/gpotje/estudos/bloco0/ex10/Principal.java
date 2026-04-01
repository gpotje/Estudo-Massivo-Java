package com.gpotje.estudos.bloco0.ex10;

public class Principal {
    public static void main(String[] args) {
        Discount member = new Member();
        Discount seasonal = new Seasonal();

        DiscountService service = new DiscountService();
        service.apply(member,1000.0);
        service.apply(seasonal,1000.0);

    }
}
